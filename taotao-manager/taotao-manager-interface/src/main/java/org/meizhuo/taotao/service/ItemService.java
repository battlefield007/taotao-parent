package org.meizhuo.taotao.service;

import org.meizhuo.taotao.common.pojo.EasyUIDataGridResult;

/**
 * @ProjectName: taotao-parent
 * @Package: org.meizhuo.taotao.service
 * @ClassName: ${TYPE_NAME}
 * @Description:
 * @Author: Gangan
 * @CreateDate: 2018/7/24 17:11
 * @UpdateUser:
 * @UpdateDate: 2018/7/24 17:11
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public interface ItemService {
    EasyUIDataGridResult getItemList(Integer page,Integer rows);
}