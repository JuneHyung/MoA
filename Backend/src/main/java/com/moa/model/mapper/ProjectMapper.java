package com.moa.model.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.moa.model.ProjectDto;

public interface ProjectMapper {

	void createProject(ProjectDto param) throws SQLException;
	
	void appendProject(ProjectDto param) throws SQLException;

	public ProjectDto[] projectInfo(String id) throws SQLException;
	
	public ProjectDto[] waitingProjectInfo(String id) throws SQLException;
	
	public ProjectDto[] completeProjectInfo(String id) throws SQLException;
	
	public ProjectDto[] interestingProjectInfo(String id) throws SQLException;
	
	void memberToComplete(int project_num) throws SQLException;
	
	void deleteMemberProject(int project_num) throws SQLException;

	void waiting(Map<String, Object> param) throws SQLException;

	void watingDelete(Map<String, Object> param) throws SQLException;

	void projectAppend(Map<String, Object> param) throws SQLException;

	void denial(Map<String, Object> param) throws SQLException;
	
	void interesting(Map<String, Object> param) throws SQLException;
	
	void interestingDelete(Map<String, Object> param) throws SQLException;

	List<ProjectDto> getFundingList() throws SQLException;

	ProjectDto getFundingDetail(int project_num) throws SQLException;
}
