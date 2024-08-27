package nn;

import a2.l0;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import e5.m;
import java.util.ArrayList;
import java.util.List;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import rd.i;
import t0.m2;
import t0.r;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ String A(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "CONSTRUCTED" : "PRIMITIVE";
    }

    public static /* synthetic */ String B(int i10) {
        switch (i10) {
            case 1:
                return "BINARY";
            case 2:
                return "NUMERIC";
            case 3:
                return "TEXT";
            case 4:
                return "MIXED";
            case 5:
                return "DOL";
            case 6:
                return "TEMPLATE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("AUTO")) {
            return 1;
        }
        if (str.equals("TEXT")) {
            return 2;
        }
        if (str.equals("BYTE")) {
            return 3;
        }
        if (str.equals("NUMERIC")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(str));
    }

    public static /* synthetic */ int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int c(double d10, int i10, int i11) {
        return (Double.hashCode(d10) + i10) * i11;
    }

    public static int d(l0 l0Var, long j10, ArrayList arrayList, int i10, int i11) {
        arrayList.add(l0Var.E(j10));
        return i10 + i11;
    }

    public static int e(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    public static BaseViewModel f(int i10, i iVar, e0 e0Var, GroupChatFragment groupChatFragment) {
        e0Var.observe(groupChatFragment, new id.a(i10, iVar));
        return groupChatFragment.r();
    }

    public static Object g(List list, int i10) {
        return list.get(list.size() - i10);
    }

    public static String h(int i10, String str, int i11) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static String j(String str, long j10) {
        return str + j10;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder p(String str, String str2) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return new StringBuilder();
    }

    public static void q(int i10, b1.c cVar, m2 m2Var, r rVar, int i11) {
        cVar.b(m2Var, rVar, Integer.valueOf(i10));
        rVar.b0(i11);
    }

    public static /* synthetic */ void r(int i10, String str) {
        if (i10 != 0) {
        } else {
            throw new NullPointerException(h.r(str, " must not be null"));
        }
    }

    public static void s(int i10, r rVar, int i11, c2.i iVar) {
        rVar.k0(Integer.valueOf(i10));
        rVar.c(Integer.valueOf(i11), iVar);
    }

    public static /* synthetic */ void t(Object obj) {
        throw new ClassCastException();
    }

    public static void u(String str, int i10, String str2) {
        m.f(str2, str + i10);
    }

    public static void v(String str, String str2, String str3) {
        m.f(str3, str + str2);
    }

    public static void w(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void x(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        al.d.f1(sb2.toString());
        throw null;
    }

    public static /* synthetic */ String y(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
    }

    public static /* synthetic */ String z(int i10) {
        switch (i10) {
            case 1:
                return "PRE_COMP";
            case 2:
                return "SOLID";
            case 3:
                return "IMAGE";
            case 4:
                return "NULL";
            case 5:
                return "SHAPE";
            case 6:
                return "TEXT";
            case 7:
                return "UNKNOWN";
            default:
                return "null";
        }
    }
}
