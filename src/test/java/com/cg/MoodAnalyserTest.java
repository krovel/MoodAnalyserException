package com.cg;
import com.cg.MoodAnalyser;
import org.junit.*;

public class MoodAnalyserTest {
	@Test
	public void TestMoodAnalysis() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
		moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
}