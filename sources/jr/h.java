package jr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import b0.l1;
import com.assetgro.stockgro.ui.DeepLinkIntents;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import j2.g0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED";
    }

    public static /* synthetic */ String C(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "Right" : "Middle" : "Left";
    }

    public static /* synthetic */ String D(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "STANDARD" : "WALL" : "UTC";
    }

    public static /* synthetic */ boolean a(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        if (i10 == 1) {
            return "events";
        }
        if (i10 == 2) {
            return "people";
        }
        if (i10 == 3) {
            return "anonymous_people";
        }
        if (i10 == 4) {
            return "groups";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "BASE";
        }
        if (i10 == 2) {
            return "REALTIME";
        }
        throw null;
    }

    public static float d(r rVar, int i10, int i11, r rVar2, boolean z10) {
        rVar.b0(i10);
        float R = kp.j.R(i11, rVar2);
        rVar.s(z10);
        return R;
    }

    public static int e(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i10, int i11) {
        arrayList.add(creator.createFromParcel(parcel));
        return i10 + i11;
    }

    public static int f(g0 g0Var, int i10, int i11) {
        return (g0Var.hashCode() + i10) * i11;
    }

    public static int g(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static Bundle h(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public static e0 i() {
        new LiveData();
        return new LiveData();
    }

    public static c2.i j(r rVar, l1 l1Var, r rVar2, r1 r1Var) {
        t.v0(rVar, l1Var, c2.k.c());
        t.v0(rVar2, r1Var, c2.k.d());
        return c2.k.b();
    }

    public static BaseViewModel k(int i10, nf.b bVar, e0 e0Var, MainActivity mainActivity) {
        e0Var.observe(mainActivity, new re.d(i10, bVar));
        return mainActivity.x();
    }

    public static Object l(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String m(String str, float f10, String str2) {
        return str + f10 + str2;
    }

    public static String n(String str, int i10) {
        return str + i10;
    }

    public static String o(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String p(String str, Uri uri) {
        return str + uri;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String t(r rVar, int i10, int i11, r rVar2, boolean z10) {
        rVar.b0(i10);
        String c12 = hl.f.c1(i11, rVar2);
        rVar.s(z10);
        return c12;
    }

    public static void u(MainActivity mainActivity, int i10) {
        el.l.I(new nf.c(mainActivity, i10));
    }

    public static void v(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static boolean w(Context context, String str, Bundle bundle, String str2) {
        Intrinsics.checkNotNullParameter(context, str);
        Intrinsics.checkNotNullParameter(bundle, str2);
        return DeepLinkIntents.b();
    }

    public static /* synthetic */ String x(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "EXCEEDS_PAD" : "NOT_NEGATIVE" : "NEVER" : "ALWAYS" : "NORMAL";
    }

    public static /* synthetic */ String y(int i10) {
        switch (i10) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
    }
}
