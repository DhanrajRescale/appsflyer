package uq;

import androidx.fragment.app.g0;
import androidx.fragment.app.x0;
import com.google.firebase.perf.metrics.Trace;
import er.f;
import fr.h;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class d extends x0 {

    /* renamed from: f, reason: collision with root package name */
    public static final yq.a f37349f = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f37350a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ll.e f37351b;

    /* renamed from: c, reason: collision with root package name */
    public final f f37352c;

    /* renamed from: d, reason: collision with root package name */
    public final b f37353d;

    /* renamed from: e, reason: collision with root package name */
    public final e f37354e;

    public d(ll.e eVar, f fVar, b bVar, e eVar2) {
        this.f37351b = eVar;
        this.f37352c = fVar;
        this.f37353d = bVar;
        this.f37354e = eVar2;
    }

    @Override // androidx.fragment.app.x0
    public final void a(g0 g0Var) {
        fr.d dVar;
        Object[] objArr = {g0Var.getClass().getSimpleName()};
        yq.a aVar = f37349f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f37350a;
        if (!weakHashMap.containsKey(g0Var)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", g0Var.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(g0Var);
        weakHashMap.remove(g0Var);
        e eVar = this.f37354e;
        boolean z10 = eVar.f37359d;
        yq.a aVar2 = e.f37355e;
        if (!z10) {
            aVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            dVar = new fr.d();
        } else {
            Map map = eVar.f37358c;
            if (!map.containsKey(g0Var)) {
                aVar2.b("Sub-recording associated with key %s was not started or does not exist", g0Var.getClass().getSimpleName());
                dVar = new fr.d();
            } else {
                zq.e eVar2 = (zq.e) map.remove(g0Var);
                fr.d a10 = eVar.a();
                if (!a10.b()) {
                    aVar2.b("stopFragment(%s): snapshot() failed", g0Var.getClass().getSimpleName());
                    dVar = new fr.d();
                } else {
                    zq.e eVar3 = (zq.e) a10.a();
                    eVar3.getClass();
                    dVar = new fr.d(new zq.e(eVar3.f42800a - eVar2.f42800a, eVar3.f42801b - eVar2.f42801b, eVar3.f42802c - eVar2.f42802c));
                }
            }
        }
        if (!dVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", g0Var.getClass().getSimpleName());
        } else {
            h.a(trace, (zq.e) dVar.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.x0
    public final void b(g0 g0Var) {
        String simpleName;
        f37349f.b("FragmentMonitor %s.onFragmentResumed", g0Var.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(g0Var.getClass().getSimpleName()), this.f37352c, this.f37351b, this.f37353d);
        trace.start();
        if (g0Var.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = g0Var.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (g0Var.getActivity() != null) {
            trace.putAttribute("Hosting_activity", g0Var.getActivity().getClass().getSimpleName());
        }
        this.f37350a.put(g0Var, trace);
        e eVar = this.f37354e;
        boolean z10 = eVar.f37359d;
        yq.a aVar = e.f37355e;
        if (!z10) {
            aVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map map = eVar.f37358c;
        if (map.containsKey(g0Var)) {
            aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", g0Var.getClass().getSimpleName());
            return;
        }
        fr.d a10 = eVar.a();
        if (!a10.b()) {
            aVar.b("startFragment(%s): snapshot() failed", g0Var.getClass().getSimpleName());
        } else {
            map.put(g0Var, (zq.e) a10.a());
        }
    }
}
