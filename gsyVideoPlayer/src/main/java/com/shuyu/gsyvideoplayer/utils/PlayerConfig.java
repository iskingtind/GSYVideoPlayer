package com.shuyu.gsyvideoplayer.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;

/**
 * Created by sweet on 2/24/17.
 */

public class PlayerConfig {
    private static final String PLAYER_CONFIG_FILE_NAME = "player_config";
    private static SharedPreferences sp;

    private static final String KEY_I_DANMU_OPACITY = "danmu_opacity";
    private static final String KEY_I_DANMU_SIZE = "danmu_size";
    private static final String KEY_I_LAND_SCREEN_TYPE = "land_screen_type";

    private static final int DEFAULT_DANMU_OPACITY = 80;
    private static final int DEFAULT_DANMU_SIZE = 50;
    private static final int DEFAULT_LAND_SCREEN_TYPE = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

    public static void init(Context context) {
        sp = context.getSharedPreferences(PLAYER_CONFIG_FILE_NAME, 0);
    }

    public static void saveDanmuOpacity(int danmuOpacity) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(KEY_I_DANMU_OPACITY, danmuOpacity);
        editor.commit();
    }

    public static int loadDanmuOpacity() {
        return sp.getInt(KEY_I_DANMU_OPACITY, DEFAULT_DANMU_OPACITY);
    }

    public static void saveDanmuSize(int danmuSize) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(KEY_I_DANMU_SIZE, danmuSize);
        editor.commit();
    }

    public static int loadDanmuSize() {
        return sp.getInt(KEY_I_DANMU_SIZE, DEFAULT_DANMU_SIZE);
    }

    public static void saveLandScreenType(int screenType) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(KEY_I_LAND_SCREEN_TYPE, screenType);
        editor.commit();
    }

    public static int loadLandScreenType() {
        return sp.getInt(KEY_I_LAND_SCREEN_TYPE, DEFAULT_LAND_SCREEN_TYPE);
    }

}
