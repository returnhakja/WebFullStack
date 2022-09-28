package blood.transfusion.view;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();
		
		System.out.println("=====모든 프로젝트 검색=====");
		controller.allBTProjects();
//		
//		System.out.println("=====(이름으로) 프로젝트 검색=====");
//		controller.getBTProjectByProjectName("A-");
//		
//		System.out.println("====새로운 BTProject 저장=====");
//		controller.getBTProjectInsert(
//				new BTProjectDTO("D-", "bt6", "donor2", "recipient2", "dana"), 
//				new DonorDTO("E-","bt5", 13,"F","B-","na"),
//				new RecipientDTO("F-","bt6", 13,"M","A-","ga")
//				);

		System.out.println("====프로젝트 아이디로 수혈자 정보 수정=====");
		controller.UpdateBTProjectByProjectId("bt3","gg");
		
//		
//		System.out.println("=====프로젝트 이름으로 프로젝트 삭제=====");
//		controller.removeBTProjectByProjectName("D-");
//		
		
	}
}
