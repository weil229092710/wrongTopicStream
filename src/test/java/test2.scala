import com.alibaba.fastjson.{JSONObject, JSONArray, JSON}

/**
  * Created by root on 2020/5/27.
  */
object test2 {
	def main(args: Array[String]) {
//		val str = "[{\"questionId\": \"5cb7e2e7468d4a0aad4b6ecf\",\"answerType\": 1,\"studentAnswer\": [{ \"index\": 0,\"proofreadResult\": 0,\"stuReply\": \"http://xhfs3.oss-cn-hangzhou.aliyuncs.com/CA103001/UploadMultiBatch/22ef805fc8b14669820eeadc6ba9ec90.json\"}]}]"
//		val json: JSONArray = JSON.parseArray(str)
//		val str1 = json.get(0).asInstanceOf[JSONObject].getString("studentAnswer")
//		val json2 = JSON.parseArray(str1)
//
//
//		println(json2.get(0).asInstanceOf[JSONObject].getString("stuReply"))

		val str =  "[{\"questionId\":\"5c77848b468d4a30eae66bc0\",\"answerType\":1,\"studentAnswer\":\"[{\"index\":0,\"inputType\":3,\"isExhibition\":false,\"isRepeatRevise\":false,\"isSeekHelp\":false,\"isShowAnswerImg\":false,\"isShowProofreadRed\":true,\"isTchRepeatRevise\":false,\"proofreadResult\":1,\"sectionIndex\":-1,\"sectionProofreadResult\":-1,\"stuReply\":\"http://xhfs2.oss-cn-hangzhou.aliyuncs.com/CA101010/brush/2019226/e66b6494b29b475ea558c3ad689f7a9f.hw\"}]\",\"right\":1},{\"questionId\":\"5c77848c468d4a30eae66bc1\",\"answerType\":1,\"studentAnswer\":\"[{\"index\":0,\"inputType\":3,\"isExhibition\":false,\"isRepeatRevise\":false,\"isSeekHelp\":false,\"isShowAnswerImg\":false,\"isShowProofreadRed\":true,\"isTchRepeatRevise\":false,\"proofreadResult\":2,\"sectionIndex\":-1,\"sectionProofreadResult\":-1,\"stuReply\":\"http://xhfs3.oss-cn-hangzhou.aliyuncs.com/CA101010/brush/2019226/50e9d2b990ed43ebb2beeb988776cd26.hw\"}]\",\"right\":0},{\"questionId\":\"5c77848c468d4a30eae66bc2\",\"answerType\":1,\"studentAnswer\":\"[{\"index\":0,\"inputType\":3,\"isExhibition\":false,\"isRepeatRevise\":false,\"isSeekHelp\":false,\"isShowAnswerImg\":false,\"isShowProofreadRed\":true,\"isTchRepeatRevise\":false,\"proofreadResult\":2,\"sectionIndex\":-1,\"sectionProofreadResult\":-1,\"stuReply\":\"http://xhfs4.oss-cn-hangzhou.aliyuncs.com/CA101010/brush/2019226/bffc1b90dfe648a884985fcbe3be948d.hw\"}]\",\"right\":0},{\"questionId\":\"5c77848c468d4a30eae66bc3\",\"answerType\":1,\"studentAnswer\":\"[{\"index\":0,\"inputType\":3,\"isExhibition\":false,\"isRepeatRevise\":false,\"isSeekHelp\":false,\"isShowAnswerImg\":false,\"isShowProofreadRed\":true,\"isTchRepeatRevise\":false,\"proofreadResult\":2,\"sectionIndex\":-1,\"sectionProofreadResult\":-1,\"stuReply\":\"http://xhfs1.oss-cn-hangzhou.aliyuncs.com/CA101010/brush/2019226/e566c31142bd4b9dbabbe9cc21ae952e.hw\"}]\",\"right\":0}]"
		val json: JSONArray = JSON.parseArray(str)
		val str1 = json.get(0).asInstanceOf[JSONObject].getString("studentAnswer")
		val json2 = JSON.parseArray(str1)


		println(json2.get(0).asInstanceOf[JSONObject].getString("stuReply"))
	}

}
