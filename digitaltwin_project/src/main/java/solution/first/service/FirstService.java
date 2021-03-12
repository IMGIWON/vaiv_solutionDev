package solution.first.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import iotr.analysis.vo.AnalysisVo;
import iotr.api.vo.ApiVoTTVo;


public interface FirstService {	
	public List<FirstVo> selectVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> selectAllAnalysisList(FirstVo analysisVo) throws Exception;
	
	public List<FirstVo> summaryVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> selectAllVdList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> inputVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> outputVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> fileAnalysisList(FirstVo analysisVo) throws Exception;
	public void deleteFileList(Map<String, Object> params) throws Exception;
	
	//분석파트 총 개수
	public int getAnlysisCnt(FirstVo analysisVo) throws Exception;
	
	//input 총 개수
	public int getAnlysisInputCnt(FirstVo analysisVo) throws Exception;
	
	//output 총 개수 
	public int getAnlysisOutputCnt(FirstVo analysisVo) throws Exception;
	
	//tag 총 개수 
	public int getAnlysisTagCnt(FirstVo analysisVo) throws Exception;
	
	public int getAnlysisFileCnt(FirstVo analysisVo) throws Exception;
	
	public int insertAnlysis(FirstVo analysisVo) throws Exception;
	public int insertAnlysisInput(FirstVo analysisVo) throws Exception;
	public int insertAnlysisOutput(FirstVo analysisVo) throws Exception;
	
	public void insertAnlysisFile(FirstVo analysisVo) throws Exception;
	public int insertAiTags(FirstVo analysisVo) throws Exception;
	public void vdIndiUpdate(FirstVo analysisVo) throws Exception;
	
	public void deleteVdFiles(FirstVo analysisVo) throws Exception;
	public void deleteVdInputs(FirstVo analysisVo) throws Exception;
	public void deleteVdOuputs(FirstVo analysisVo) throws Exception;
	public void deleteVdTags(FirstVo analysisVo) throws Exception;
	public void deleteVd(FirstVo analysisVo) throws Exception;
	
	public String getfilePath(HashMap<String, Object> params) throws Exception;
	public void vdInfoUpdate(FirstVo analysisVo) throws Exception;
}


