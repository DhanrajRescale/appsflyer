package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r0[r3] = r5     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L63
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r0[r3] = r5     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L7d:
            r0 = r4
        L7e:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r7[r3] = r8     // Catch: java.lang.Exception -> L9b
            r7[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La1:
            r0 = r4
        La2:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb5
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb5
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lb5
        Lb5:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i10, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i10 = -1;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i10 = applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i10 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 != null && (method = zzh) != null) {
                try {
                    Object invoke = method2.invoke(workSource, new Object[0]);
                    int i11 = zza;
                    if (i10 != i11) {
                        method.invoke(invoke, Integer.valueOf(i10), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i11), str2);
                } catch (Exception e10) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e10);
                }
            } else {
                add(workSource, i10, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i10) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i10));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i10) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return null;
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            size = 0;
        } else {
            size = size(workSource);
        }
        if (size != 0) {
            for (int i10 = 0; i10 < size; i10++) {
                String name = getName(workSource, i10);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@NonNull Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        if (size(workSource) != 0) {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
