package model;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {

//	//step01 *
//	//Driver 로딩
//	static { //static 필드에서 선언해줌
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	// step02
	// 모든 부서 검색 메소드
	// Query : "select * from dept"
	public static ArrayList<DeptDTO> getAllDept() throws SQLException{
		ArrayList<DeptDTO> allData = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
	//step02 *
	// DB 연결
	// 알아야 할 것 ip주소, DB이름 , 계정 이름, 비밀번호 
	try {
//	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","scott", "tiger");
	 conn = DBUtil.getConnection();
	
	 //step03
	 // SQL 문장 객체
	 stmt = conn.createStatement();
	 
	 //step04
	 // SQL 문장 객체 실행 - 결과 반환
//	 String sql1="select * from dept";
//	 rset = stmt.executeQuery(sql1);
	 rset = stmt.executeQuery("select * from dept");
	 
//	 System.out.println(rset);
	 
	 //step05
	 // Data 활용
	 allData = new ArrayList<DeptDTO>();
	 while(rset.next()) {
		 allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
//		 System.out.println(allData);
	 }
//	 conn.commit();
	 
	 //step06
	 //DB종료 *
	} finally {
//		conn.close();
		DBUtil.close(rset, stmt, conn);
	}
	return allData;
	}
	
	//부서 이름으로 특정 부서 검색
	// Query : "select * from dept where dname = 'ACCOUNTING' and deptno = 10"
	private static DeptDTO getDept(String dname) throws SQLException{
		DeptDTO allData1 = null;
		Connection connn = null;
//		Statement stmtt = null;
		PreparedStatement pstmt = null; // 바로 준비해줌
		ResultSet rsett = null;

	try {
//	 connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","scott", "tiger");
		connn = DBUtil.getConnection();
	 pstmt = connn.prepareStatement("select * from dept where dname = ?"); // ?는 어떤 칼럼에 조건이 들어갈지 준비?
	 pstmt.setString(1, dname); // 처음 ?에 넣어주삼
	 rsett = pstmt.executeQuery();
//	 stmtt = connn.createStatement();
//	 rsett = stmtt.executeQuery("select dname from dept where dname='ACCOUNTING'");
//	 rsett = stmtt.executeQuery("select * from dept where dname = " + ""
//	 		+ "'"+ dname +"'" );
		
	 
	 while(rsett.next()) {
//		 System.out.println(rsett.getString("dname"));
		 allData1 = new DeptDTO(rsett.getInt("deptno"), rsett.getString("dname"), rsett.getString("loc"));
		 
	 }
	}finally {
		
		DBUtil.close(rsett, pstmt, connn);
	}
	return allData1;
	
}
	
	// 부서 생성 메소드 insert
	// Query : insert into dept values(deptno, dname, loc); -> Psmt 
	
	public static boolean inserDept(DeptDTO dept) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","scott", "tiger");
			conn = DBUtil.getConnection();
			//실행될수있는 쿼리를생성
			pstmt = conn.prepareStatement("insert into dept values(?, ?, ?)");
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			//실행
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
			
			
		}finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}
		return false;
	}
	
	public static boolean updateDept(int a, String b) throws SQLException{
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","scott", "tiger");
			conn = DBUtil.getConnection();
			//실행될수있는 쿼리를생성
			pstmt = conn.prepareStatement("UPDATE Dept SET LOC = ? WHERE DEPTNO = ?");
			
			pstmt.setString(1, b);
			pstmt.setInt(2, a);
	
			
			
			//실행
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
			
			
		}finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}
		return false;
	}
	
	//삭제
	public static boolean deleteDept(int a) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","scott", "tiger");
			conn = DBUtil.getConnection();
			//실행될수있는 쿼리를생성
			pstmt = conn.prepareStatement("DELETE FROM Dept WHERE DEPTNO = ?" );
			
			
			pstmt.setInt(1, a);
			
			
			//실행
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
			
			
		}finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		try {
//			getAllDept();
			//모든 부서 검색
			for(DeptDTO dept :getAllDept()) {
				System.out.println(dept);
			}
			
			//(부서이름으로) 특정 부서를 검색
			// getDept(String  dname)
//			System.out.println(getDept("ACCOUNTING"));
			
			//부서 생성
			// boolean inserDept (Dept dept);
//			System.out.println(inserDept(new DeptDTO(50, "PRO", "BUSAN")));
			
			// (부서 번호로) 검색한 해당 부서의 위치 수정
			//updateDept(50, "SEOUL") : BUSAN -> SEOUL
//			updateDept(50 , "SEOUL"); 
			// (부서 번호로) 검색한 해당 부서 삭제
			//deleteDept(50)
//			deleteDept(50);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}
