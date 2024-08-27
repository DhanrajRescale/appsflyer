package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFi1lSDK;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.perf.session.SessionManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1677d;

    public /* synthetic */ e(int i10, Object obj, Object obj2, Object obj3) {
        this.f1674a = i10;
        this.f1675b = obj;
        this.f1676c = obj2;
        this.f1677d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1674a;
        final int i11 = 0;
        Object obj = this.f1677d;
        Object obj2 = this.f1676c;
        Object obj3 = this.f1675b;
        switch (i10) {
            case 0:
                List awaitingContainerChanges = (List) obj3;
                f2 operation = (f2) obj2;
                n this$0 = (n) obj;
                Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    this$0.getClass();
                    View view = operation.f1698c.mView;
                    e2 e2Var = operation.f1696a;
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    e2Var.a(view);
                    return;
                }
                return;
            case 1:
                x1 impl = (x1) obj3;
                Rect lastInEpicenterRect = (Rect) obj;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                impl.getClass();
                x1.g((View) obj2, lastInEpicenterRect);
                return;
            case 2:
                n this$02 = (n) obj;
                i animationInfo = (i) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$02.f1769a.endViewTransition((View) obj3);
                animationInfo.a();
                return;
            case 3:
                i5.r0 r0Var = (i5.r0) obj3;
                r5.w wVar = (r5.w) obj;
                r0Var.getClass();
                lp.j1 e02 = ((lp.k0) obj2).e0();
                j5.w wVar2 = (j5.w) r0Var.f19629c;
                b5.a1 a1Var = wVar2.f21017g;
                a1Var.getClass();
                j5.v vVar = wVar2.f21014d;
                vVar.getClass();
                vVar.f21006b = lp.o0.q(e02);
                if (!e02.isEmpty()) {
                    vVar.f21009e = (r5.w) e02.get(0);
                    wVar.getClass();
                    vVar.f21010f = wVar;
                }
                if (vVar.f21008d == null) {
                    vVar.f21008d = j5.v.b(a1Var, vVar.f21006b, vVar.f21009e, vVar.f21005a);
                }
                vVar.d(((i5.g0) a1Var).w());
                return;
            case 4:
                Pair pair = (Pair) obj2;
                ((j5.w) ((i5.a1) ((tr.e) obj3).f36362c).f19352h).I(((Integer) pair.first).intValue(), (r5.w) pair.second, (Exception) obj);
                return;
            case 5:
                tr.e eVar = (tr.e) obj3;
                final b5.v vVar2 = (b5.v) obj2;
                final i5.h hVar = (i5.h) obj;
                i5.d0 d0Var = (i5.d0) eVar.f36362c;
                int i12 = e5.x.f15050a;
                d0Var.getClass();
                i5.g0 g0Var = ((i5.d0) eVar.f36362c).f19384a;
                g0Var.getClass();
                j5.w wVar3 = (j5.w) g0Var.f19472r;
                final j5.b U = wVar3.U();
                final int i13 = 1;
                wVar3.V(U, 1009, new e5.j(U, vVar2, hVar, i13) { // from class: j5.u

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f21004a;

                    {
                        this.f21004a = i13;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj4) {
                        switch (this.f21004a) {
                            case 0:
                                ((c) obj4).getClass();
                                return;
                            default:
                                ((c) obj4).getClass();
                                return;
                        }
                    }
                });
                return;
            case 6:
                n5.l lVar = (n5.l) obj3;
                ((n5.m) obj2).I(lVar.f28314a, lVar.f28315b, (Exception) obj);
                return;
            case 7:
                l0.j jVar = (l0.j) obj3;
                ((r5.b0) obj2).o(jVar.f23773a, (r5.w) jVar.f23774b, (r5.s) obj);
                return;
            case 8:
            default:
                ((nv.k) obj2).a((nv.p) ((ep.m) obj3).f15795c, (Throwable) obj);
                return;
            case 9:
                final b5.v vVar3 = (b5.v) obj2;
                final i5.h hVar2 = (i5.h) obj;
                x5.w wVar4 = (x5.w) ((x5.e) obj3).f39981b;
                int i14 = e5.x.f15050a;
                wVar4.getClass();
                i5.g0 g0Var2 = ((i5.d0) wVar4).f19384a;
                g0Var2.getClass();
                j5.w wVar5 = (j5.w) g0Var2.f19472r;
                final j5.b U2 = wVar5.U();
                wVar5.V(U2, 1017, new e5.j(U2, vVar3, hVar2, i11) { // from class: j5.u

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f21004a;

                    {
                        this.f21004a = i11;
                    }

                    @Override // e5.j
                    public final void invoke(Object obj4) {
                        switch (this.f21004a) {
                            case 0:
                                ((c) obj4).getClass();
                                return;
                            default:
                                ((c) obj4).getClass();
                                return;
                        }
                    }
                });
                return;
            case 10:
                ((AFb1vSDK) obj3).AFInAppEventType((Context) obj2, (Intent) obj);
                return;
            case 11:
                ((AFi1aSDK) obj3).values((AFi1lSDK) obj2, (Runnable) obj);
                return;
            case 12:
                wl.b this$03 = (wl.b) obj3;
                wl.q request = (wl.q) obj2;
                Bundle values = (Bundle) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(values, "$values");
                try {
                    this$03.j(values, request);
                    this$03.o(request, values, null);
                    return;
                } catch (FacebookException e10) {
                    this$03.o(request, null, e10);
                    return;
                }
            case 13:
                wl.f0 this$04 = (wl.f0) obj3;
                wl.q request2 = (wl.q) obj2;
                Bundle extras = (Bundle) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(request2, "$request");
                Intrinsics.checkNotNullParameter(extras, "$extras");
                try {
                    this$04.j(extras, request2);
                    this$04.p(extras, request2);
                    return;
                } catch (FacebookServiceException e11) {
                    xk.q qVar = e11.f10881b;
                    this$04.o(request2, qVar.f40461d, qVar.a(), String.valueOf(qVar.f40459b));
                    return;
                } catch (FacebookException e12) {
                    this$04.o(request2, null, e12.getMessage(), null);
                    return;
                }
            case 14:
                Utils.e((Callable) obj3, (Executor) obj2, (TaskCompletionSource) obj);
                return;
            case 15:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) obj3;
                Intent intent = (Intent) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                int i15 = com.google.firebase.messaging.g.f11746a;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 16:
                SessionManager.b((SessionManager) obj3, (Context) obj2, (cr.a) obj);
                return;
            case 17:
                er.f fVar = (er.f) obj3;
                yq.a aVar = er.f.f15841r;
                fVar.getClass();
                gr.s B = gr.t.B();
                B.i();
                gr.t.x((gr.t) B.f11975b, (gr.a0) obj2);
                fVar.d(B, (gr.i) obj);
                return;
            case 18:
                er.f fVar2 = (er.f) obj3;
                yq.a aVar2 = er.f.f15841r;
                fVar2.getClass();
                gr.s B2 = gr.t.B();
                B2.i();
                gr.t.y((gr.t) B2.f11975b, (gr.r) obj2);
                fVar2.d(B2, (gr.i) obj);
                return;
            case 19:
                er.f fVar3 = (er.f) obj3;
                yq.a aVar3 = er.f.f15841r;
                fVar3.getClass();
                gr.s B3 = gr.t.B();
                B3.i();
                gr.t.w((gr.t) B3.f11975b, (gr.o) obj2);
                fVar3.d(B3, (gr.i) obj);
                return;
            case 20:
                Pattern pattern = jr.j.f21616e;
                ((BiConsumer) obj3).accept((String) obj2, (jr.e) obj);
                return;
            case 21:
                WebView this_invoke = (WebView) obj2;
                String function = (String) obj;
                List stringArgs = (List) obj3;
                Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
                Intrinsics.checkNotNullParameter(function, "$function");
                Intrinsics.checkNotNullParameter(stringArgs, "$stringArgs");
                this_invoke.loadUrl("javascript:" + function + '(' + vt.g0.B(stringArgs, ",", null, null, null, 62) + ')');
                return;
            case 22:
                nv.k kVar = (nv.k) obj2;
                nv.v0 v0Var = (nv.v0) obj;
                nv.p pVar = (nv.p) ((ep.m) obj3).f15795c;
                if (pVar.f29238b.isCanceled()) {
                    kVar.a(pVar, new IOException("Canceled"));
                    return;
                } else {
                    kVar.b(pVar, v0Var);
                    return;
                }
        }
    }

    public /* synthetic */ e(WebView webView, String str, ArrayList arrayList) {
        this.f1674a = 21;
        this.f1676c = webView;
        this.f1677d = str;
        this.f1675b = arrayList;
    }

    public /* synthetic */ e(n nVar, View view, i iVar) {
        this.f1674a = 2;
        this.f1677d = nVar;
        this.f1675b = view;
        this.f1676c = iVar;
    }
}
