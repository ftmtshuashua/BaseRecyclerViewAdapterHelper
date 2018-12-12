package com.chad.library.adapter.base;

import android.util.SparseArray;

import java.util.HashMap;
import java.util.Map;

import androidx.recyclerview.widget.RecyclerView;

/**
 * <pre>
 * Tip:
 *      提供一些增强功能实现
 *
 * Function:
 *
 * Created by LiFuPing on 2018/12/11 17:16
 * </pre>
 */
public abstract class EnhanceRecyclerViewAdapter<K extends BaseViewHolder> extends RecyclerView.Adapter<K> {

    private SparseArray<Map<String, Object>> arrays;

    /**
     * 获得缓存配置
     *
     * @param index
     * @return
     */
    public Map<String, Object> getCache(int index) {
        initCacheKeys(index);
        return arrays.get(index);
    }
    

    private void initCacheKeys(int index) {
        if (arrays == null) arrays = new SparseArray<>();
        Map map = arrays.get(index);
        if (map == null) {
            map = new HashMap();
            arrays.put(index, map);
        }

    }

}
