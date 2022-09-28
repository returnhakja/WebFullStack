package blood.transfusion.controller;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.model.BloodTransfusionVirtualDB;
import blood.transfusion.service.BloodTransFusionProjectService;
import blood.transfusion.view.EndView;

public class BloodTransfusionController {
	private static BloodTransfusionController instance = new BloodTransfusionController();
	private BloodTransFusionProjectService service = BloodTransFusionProjectService.getInstance();

	private BloodTransfusionController() {}

	public static BloodTransfusionController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void projectListView() {
		
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
//		System.out.println(projectList);
		EndView.projectListView(projectList);
	}
	
	// 특정 프로젝트 검색_
	public void projectView(String projectName) {
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
//		ArrayList<BloodTransfusionProject> projectList = service.getProject();
//		projectList.stream().filter(v->v.getBtProjectName().contains(projectName)).forEach(v->System.out.println(v));
		projectList.stream().filter(v->v.getBtProjectName().matches(projectName)).forEach(v->System.out.println(v));
		
		
	}

	// 새로운 프로젝트 저장
	public void insertProject(BloodTransfusionProject newProject) {
		service.projectInsert(newProject);
	}
	
	// 존재하는 프로젝트 수정_
	public void updateProject(String projectName, People people) {
		
	}

	// 이름으로 검색한 프로젝트 삭제_
	public void deleteProject(String projectName) {
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
			
	}
}




























