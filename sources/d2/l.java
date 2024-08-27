package d2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f13491a;

    public l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f13491a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [d2.t1, java.lang.Object] */
    public final void a(j2.e eVar) {
        List list;
        byte b10;
        List list2 = eVar.f20700b;
        if (list2 == null) {
            list = vt.i0.f38321a;
        } else {
            list = list2;
        }
        boolean isEmpty = list.isEmpty();
        String str = eVar.f20699a;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            ?? obj = new Object();
            obj.f13645a = Parcel.obtain();
            if (list2 == null) {
                list2 = vt.i0.f38321a;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                j2.d dVar = (j2.d) list2.get(i10);
                j2.b0 b0Var = (j2.b0) dVar.f20685a;
                obj.f13645a.recycle();
                obj.f13645a = Parcel.obtain();
                long a10 = b0Var.f20659a.a();
                long j10 = n1.t.f28177i;
                if (!n1.t.d(a10, j10)) {
                    obj.b((byte) 1);
                    obj.f13645a.writeLong(b0Var.f20659a.a());
                }
                long j11 = w2.m.f38804c;
                long j12 = b0Var.f20660b;
                byte b11 = 2;
                if (!w2.m.a(j12, j11)) {
                    obj.b((byte) 2);
                    obj.d(j12);
                }
                o2.d0 d0Var = b0Var.f20661c;
                if (d0Var != null) {
                    obj.b((byte) 3);
                    obj.f13645a.writeInt(d0Var.f29469a);
                }
                o2.z zVar = b0Var.f20662d;
                if (zVar != null) {
                    obj.b((byte) 4);
                    int i11 = zVar.f29542a;
                    if (o2.z.a(i11, 0) || !o2.z.a(i11, 1)) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                    obj.b(b10);
                }
                o2.a0 a0Var = b0Var.f20663e;
                if (a0Var != null) {
                    obj.b((byte) 5);
                    int i12 = a0Var.f29453a;
                    if (!o2.a0.a(i12, 0)) {
                        if (o2.a0.a(i12, 1)) {
                            b11 = 1;
                        } else if (!o2.a0.a(i12, 2)) {
                            if (o2.a0.a(i12, 3)) {
                                b11 = 3;
                            }
                        }
                        obj.b(b11);
                    }
                    b11 = 0;
                    obj.b(b11);
                }
                String str2 = b0Var.f20665g;
                if (str2 != null) {
                    obj.b((byte) 6);
                    obj.f13645a.writeString(str2);
                }
                long j13 = b0Var.f20666h;
                if (!w2.m.a(j13, j11)) {
                    obj.b((byte) 7);
                    obj.d(j13);
                }
                u2.a aVar = b0Var.f20667i;
                if (aVar != null) {
                    obj.b((byte) 8);
                    obj.c(aVar.f36667a);
                }
                u2.o oVar = b0Var.f20668j;
                if (oVar != null) {
                    obj.b((byte) 9);
                    obj.c(oVar.f36693a);
                    obj.c(oVar.f36694b);
                }
                long j14 = b0Var.f20670l;
                if (!n1.t.d(j14, j10)) {
                    obj.b((byte) 10);
                    obj.f13645a.writeLong(j14);
                }
                u2.j jVar = b0Var.f20671m;
                if (jVar != null) {
                    obj.b((byte) 11);
                    obj.f13645a.writeInt(jVar.f36687a);
                }
                n1.w0 w0Var = b0Var.f20672n;
                if (w0Var != null) {
                    obj.b((byte) 12);
                    obj.f13645a.writeLong(w0Var.f28205a);
                    long j15 = w0Var.f28206b;
                    obj.c(m1.c.d(j15));
                    obj.c(m1.c.e(j15));
                    obj.c(w0Var.f28207c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.f13645a.marshall(), 0)), dVar.f20686b, dVar.f20687c, 33);
            }
            str = spannableString;
        }
        this.f13491a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
