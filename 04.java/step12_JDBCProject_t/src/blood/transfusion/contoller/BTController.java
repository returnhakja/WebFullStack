package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BTProjectDAO;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.view.RunningEndView;
//import blood.transfusion.view.RunningSuccessView;
import blood.transfusion.view.RunningSuccessView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();
	
	private BTController() {}
	
	public static BTController getInstance() {
		return instance;
	}
	
	// 모든 프로젝트 검색
	public void allBTProjects(){
		try{
			RunningEndView.projectListView(service.getAllBTProjects());
			RunningSuccessView.showSuccess("모든 프로젝트 검색 성공");
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}
	
	}
	
	// 특정 프로젝트 검색
	public void getBTProjectByProjectName(String projectName) {
		try {
			RunningEndView.projectView(service.getBTProject(projectName));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// 새로운 프로젝트 저장 로직
	public void getBTProjectInsert(BTProjectDTO btProject, DonorDTO doProject, RecipientDTO rcProject
			) {
		try {
			service.addBTProject(btProject);
			service.addDonor(doProject);
			service.addRecipient(rcProject);
			System.out.println("새로 저장");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// 특정 프로젝트 업데이트
	public void UpdateBTProjectByProjectId(String btProjectId, String recipientId) {
	 try {
		service.updateBTProject(btProjectId,  recipientId);
//		service.updateDonor(donorId, purposeDonation);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotExistException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	}
	
	// 특정 프로젝트 삭제
	public void removeBTProjectByProjectName(String projectName) {
		try {
			service.deleteBTProject(projectName);
//			service.deleteDonor(projectName);
//			service.deleteRecipient(projectName);
			System.out.println("삭제되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			e.printStackTrace();
		}
		
	}
 
	
	// 모든 헌혈자 검색 로직
	public static ArrayList<DonorDTO> getAllDonors(){
		ArrayList<DonorDTO> allProject = null;
		try{
			RunningEndView.projectListView(DonorDAO.getAllDonors());
//			RunningSuccessView.showSuccess("모든  헌혈자 검색 성공");
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("모든  헌혈자 검색시 에러 발생");
		}
		return allProject;
	}




	
	
	
}
