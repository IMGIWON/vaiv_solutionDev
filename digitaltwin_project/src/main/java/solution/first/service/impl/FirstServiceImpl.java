package solution.first.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iotr.analysis.mapper.AnalysisMapper;
import iotr.analysis.service.AnalysisService;
import iotr.analysis.vo.AnalysisVo;
import iotr.api.service.ApiRestService;
import iotr.api.vo.ApiVoTTVo;

@Service("AnalysisService")
public class FirstServiceImpl implements FirstService {

	@Autowired
	private FirstMapper Analysis;
	
	@Override
	public List<FirstVo> selectVideoAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.selectVideoAnalysisList(analysisVo);
		return result;
	}
	
	@Override
	public List<FirstVo> selectAllAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.selectAllAnalysisList(analysisVo);
		return result;
	}
	
	@Override
	public List<FirstVo> summaryVideoAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.summaryVideoAnalysisList(analysisVo);
		return result;
	}
	
	@Override
	public List<FirstVo> selectAllVdList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.selectAllVdList(analysisVo);
		return result;
	}
	
	@Override
	public List<FirstVo> inputVideoAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.inputVideoAnalysisList(analysisVo);
		return result;
	}
	
	@Override
	public List<FirstVo> outputVideoAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.outputVideoAnalysisList(analysisVo);
		return result;
	}
	@Override
	public List<FirstVo> fileAnalysisList(FirstVo analysisVo) throws Exception {
		List<FirstVo> result = Analysis.fileAnalysisList(analysisVo);
		return result;
	}

	@Override
	public int getAnlysisCnt(FirstVo analysisVo) throws Exception {
		return Analysis.getAnlysisCnt(analysisVo);
	}

	@Override
	public int getAnlysisInputCnt(FirstVo analysisVo) throws Exception {
		return Analysis.getAnlysisInputCnt(analysisVo);
	}

	@Override
	public int getAnlysisOutputCnt(FirstVo analysisVo) throws Exception {
		return Analysis.getAnlysisOutputCnt(analysisVo);
	}
	
	@Override
	public int getAnlysisFileCnt(FirstVo analysisVo) throws Exception {
		return Analysis.getAnlysisFileCnt(analysisVo);
	}
	
	@Override
	public int getAnlysisTagCnt(FirstVo analysisVo) throws Exception {
		return Analysis.getAnlysisTagCnt(analysisVo);
	}
	
	@Override
	public int insertAnlysis(FirstVo analysisVo) throws Exception {
		return Analysis.insertAnlysis(analysisVo);
	}
	
	@Override
	public int insertAnlysisInput(FirstVo analysisVo) throws Exception {
		return Analysis.insertAnlysisInput(analysisVo);
	}
	
	@Override
	public int insertAnlysisOutput(FirstVo analysisVo) throws Exception {
		return Analysis.insertAnlysisOutput(analysisVo);
	}
	@Override
	public void insertAnlysisFile(FirstVo analysisVo) throws Exception {
		Analysis.insertAnlysisFile(analysisVo);
	}
	
	@Override
	public int insertAiTags(FirstVo analysisVo) throws Exception {
		int result = Analysis.insertAiTags(analysisVo);
		return result;
	}
	
	@Override
	public void vdIndiUpdate(FirstVo analysisVo) throws Exception {
		Analysis.vdIndiUpdate(analysisVo);
	}

	@Override
	public void deleteVdFiles(FirstVo analysisVo) throws Exception {
		Analysis.deleteVdFiles(analysisVo);
		
	}

	@Override
	public void deleteVdInputs(FirstVo analysisVo) throws Exception {
		Analysis.deleteVdInputs(analysisVo);
		
	}

	@Override
	public void deleteVdOuputs(FirstVo analysisVo) throws Exception {
		Analysis.deleteVdOuputs(analysisVo);
		
	}

	@Override
	public void deleteVdTags(FirstVo analysisVo) throws Exception {
		Analysis.deleteVdTags(analysisVo);
		
	}

	@Override
	public void deleteVd(FirstVo analysisVo) throws Exception {
		Analysis.deleteVd(analysisVo);
		
	}

	@Override
	public String getfilePath(HashMap<String, Object> params) throws Exception {
		return Analysis.getfilePath(params);
		
	}
	
	@Override
	public void vdInfoUpdate(FirstVo analysisVo) throws Exception {
		Analysis.vdInfoUpdate(analysisVo);
	}

	@Override
	public void deleteFileList(Map<String, Object> params) throws Exception {
		Analysis.deleteFileList(params);
	}
}


