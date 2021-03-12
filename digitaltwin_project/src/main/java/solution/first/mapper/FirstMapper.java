package solution.first.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import iotr.analysis.vo.AnalysisVo;
import iotr.api.vo.ApiVoTTVo;

@Mapper
public interface FirstMapper {
	public List<FirstVo> selectVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> selectAllAnalysisList(FirstVo analysisVo) throws Exception;
	
	public List<FirstVo> summaryVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> selectAllVdList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> inputVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> outputVideoAnalysisList(FirstVo analysisVo) throws Exception;
	public List<FirstVo> fileAnalysisList(FirstVo analysisVo) throws Exception;
	public void deleteFileList(Map<String, Object> params) throws Exception;
	
	public int getAnlysisCnt(FirstVo analysisVo) throws Exception;
	public int getAnlysisInputCnt(FirstVo analysisVo) throws Exception;
	public int getAnlysisOutputCnt(FirstVo analysisVo) throws Exception;
	public int getAnlysisFileCnt(FirstVo analysisVo) throws Exception;
	public int getAnlysisTagCnt(FirstVo analysisVo) throws Exception;
	
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


