package d4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13826d;

    public /* synthetic */ t(int i10, Object obj, Object obj2, Object obj3) {
        this.f13823a = i10;
        this.f13824b = obj;
        this.f13825c = obj2;
        this.f13826d = obj3;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m event) {
        int i10 = this.f13823a;
        Object obj = this.f13826d;
        Object obj2 = this.f13825c;
        Object obj3 = this.f13824b;
        switch (i10) {
            case 0:
                v vVar = (v) obj3;
                androidx.lifecycle.n nVar = (androidx.lifecycle.n) obj2;
                x xVar = (x) obj;
                vVar.getClass();
                androidx.lifecycle.m.Companion.getClass();
                androidx.lifecycle.m c10 = androidx.lifecycle.k.c(nVar);
                Runnable runnable = vVar.f13844a;
                CopyOnWriteArrayList copyOnWriteArrayList = vVar.f13845b;
                if (event == c10) {
                    copyOnWriteArrayList.add(xVar);
                    runnable.run();
                    return;
                } else if (event == androidx.lifecycle.m.ON_DESTROY) {
                    vVar.b(xVar);
                    return;
                } else {
                    if (event == androidx.lifecycle.k.a(nVar)) {
                        copyOnWriteArrayList.remove(xVar);
                        runnable.run();
                        return;
                    }
                    return;
                }
            default:
                Function2 function2 = (Function2) obj3;
                String videoUrl = (String) obj2;
                t0.g1 youtubePlayer$delegate = (t0.g1) obj;
                Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
                Intrinsics.checkNotNullParameter(youtubePlayer$delegate, "$youtubePlayer$delegate");
                Intrinsics.checkNotNullParameter(tVar, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = wb.q.f38989a[event.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        qs.e eVar = (qs.e) youtubePlayer$delegate.getValue();
                        if (eVar != null) {
                            us.g gVar = (us.g) eVar;
                            gVar.a(gVar.f37378a, "playVideo", new Object[0]);
                        }
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, videoUrl);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qs.e eVar2 = (qs.e) youtubePlayer$delegate.getValue();
                if (eVar2 != null) {
                    ((us.g) eVar2).c();
                }
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, videoUrl);
                    return;
                }
                return;
        }
    }
}
