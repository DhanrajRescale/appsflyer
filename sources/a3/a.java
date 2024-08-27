package a3;

import android.os.Parcel;
import android.widget.TextView;
import androidx.fragment.app.g0;
import hv.q;
import hv.t;
import iu.a0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.k;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "Vertical" : "Horizontal";
    }

    public static /* synthetic */ String C(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "Expand" : "Wrap";
    }

    public static /* synthetic */ String D(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }

    public static t a(hv.e eVar, hv.e eVar2) {
        q p10 = q.p();
        eVar.getClass();
        return t.p(eVar2, p10);
    }

    public static iu.e b(Class cls, String str, Class cls2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(cls, str);
        iu.e a10 = a0.a(cls2);
        Intrinsics.checkNotNullParameter(a10, str2);
        Intrinsics.checkNotNullParameter(a10, str3);
        return a10;
    }

    public static Object c(Function1 function1, String str, Object obj, String str2, Object obj2) {
        Intrinsics.checkNotNullParameter(function1, str);
        Intrinsics.checkNotNullParameter(obj, str2);
        return function1.invoke(obj2);
    }

    public static String d(String str) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, str);
        return uuid;
    }

    public static String e(String str, g0 g0Var, String str2) {
        return str + g0Var + str2;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(String str, List list, String str2) {
        return str + list + str2;
    }

    public static String i(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(Object[] objArr, int i10, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i10));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }

    public static StringBuilder n(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static Iterator o(Parcel parcel, int i10, List list) {
        parcel.writeInt(i10);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator p(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void q(Parcel parcel, int i10, Boolean bool) {
        parcel.writeInt(i10);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void r(Parcel parcel, int i10, Long l10) {
        parcel.writeInt(i10);
        parcel.writeLong(l10.longValue());
    }

    public static void s(TextView textView, int i10) {
        textView.setTextColor(k.getColor(textView.getContext(), i10));
    }

    public static void t(fr.i iVar, zq.g gVar, zq.g gVar2) {
        gVar.k(iVar.a());
        br.h.c(gVar2);
    }

    public static /* synthetic */ void u(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void v(StringBuilder sb2, String str, double d10, String str2) {
        sb2.append(str);
        sb2.append(d10);
        sb2.append(str2);
    }

    public static /* synthetic */ String w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
    }

    public static /* synthetic */ String x(int i10) {
        switch (i10) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "LOADING" : "FAILURE" : "SUCCESS";
    }

    public static /* synthetic */ String z(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "LINEAR" : "EXPONENTIAL";
    }
}
