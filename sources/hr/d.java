package hr;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import i5.w;
import m.a4;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements bq.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18693c;

    public /* synthetic */ d(String str, int i10, Object obj) {
        this.f18691a = i10;
        this.f18692b = str;
        this.f18693c = obj;
    }

    @Override // bq.d
    public final Object h(a4 a4Var) {
        int i10 = this.f18691a;
        Object obj = this.f18693c;
        String str = this.f18692b;
        switch (i10) {
            case 0:
                Context context = (Context) a4Var.a(Context.class);
                int i11 = ((w) ((e) obj)).f19660a;
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                switch (i11) {
                    case 19:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 21:
                        int i12 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str2 = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str2 = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str2 = "auto";
                            break;
                        } else if (i12 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str2 = "embedded";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new a(str, str2);
            default:
                bq.a aVar = (bq.a) obj;
                try {
                    Trace.beginSection(str);
                    return aVar.f7243f.h(a4Var);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
