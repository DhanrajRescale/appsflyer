package i1;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import d2.b3;
import h.m0;
import h2.o;
import h2.r;
import hl.f;
import j2.e;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19306a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3 = r3.getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r3 = r3.getValue("android:text");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(i1.c r6, android.util.LongSparseArray r7) {
        /*
            c4.b r0 = new c4.b
            r0.<init>(r7)
        L5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            long r1 = r0.b()
            java.lang.Object r3 = r7.get(r1)
            android.view.translation.ViewTranslationResponse r3 = a4.c.m(r3)
            if (r3 == 0) goto L5
            android.view.translation.TranslationResponseValue r3 = a4.c.j(r3)
            if (r3 == 0) goto L5
            java.lang.CharSequence r3 = a4.c.o(r3)
            if (r3 == 0) goto L5
            t.t r4 = r6.h()
            int r1 = (int) r1
            java.lang.Object r1 = r4.g(r1)
            d2.b3 r1 = (d2.b3) r1
            if (r1 == 0) goto L5
            h2.o r1 = r1.f13370a
            if (r1 == 0) goto L5
            h2.u r2 = h2.i.f17833i
            h2.j r1 = r1.f17862d
            java.lang.Object r1 = hl.f.m0(r1, r2)
            h2.a r1 = (h2.a) r1
            if (r1 == 0) goto L5
            ut.d r1 = r1.f17810b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L5
            j2.e r2 = new j2.e
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 6
            r2.<init>(r3, r4, r5)
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L5
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.a(i1.c, android.util.LongSparseArray):void");
    }

    public final void b(@NotNull c cVar, @NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        o oVar;
        AutofillId autofillId;
        String T0;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j10 : jArr) {
            b3 b3Var = (b3) cVar.h().g((int) j10);
            if (b3Var != null && (oVar = b3Var.f13370a) != null) {
                a4.c.p();
                autofillId = cVar.f19312a.getAutofillId();
                ViewTranslationRequest.Builder k10 = a4.c.k(autofillId, oVar.f17865g);
                List list = (List) f.m0(oVar.f17862d, r.f17903w);
                if (list != null && (T0 = j.T0(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new e(T0, null, 6));
                    k10.setValue("android:text", forText);
                    build = k10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(@NotNull c cVar, @NotNull LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f19312a.post(new m0(1, cVar, longSparseArray));
        }
    }
}
