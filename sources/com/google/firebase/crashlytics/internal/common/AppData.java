package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.List;

/* loaded from: classes2.dex */
public class AppData {
    public final String buildId;
    public final List<BuildIdInfo> buildIdInfoList;
    public final DevelopmentPlatformProvider developmentPlatformProvider;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public AppData(String str, String str2, List<BuildIdInfo> list, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.googleAppId = str;
        this.buildId = str2;
        this.buildIdInfoList = list;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
        this.developmentPlatformProvider = developmentPlatformProvider;
    }

    public static AppData create(Context context, IdManager idManager, String str, String str2, List<BuildIdInfo> list, DevelopmentPlatformProvider developmentPlatformProvider) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String installerPackageName = idManager.getInstallerPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = IdManager.DEFAULT_VERSION_NAME;
        }
        return new AppData(str, str2, list, installerPackageName, packageName, num, str3, developmentPlatformProvider);
    }
}
