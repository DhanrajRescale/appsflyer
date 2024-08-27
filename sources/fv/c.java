package fv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.d0;
import vt.o0;

/* loaded from: classes2.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i10) {
        super(1);
        this.f16274a = i10;
        this.f16275b = eVar;
    }

    public final void a(f it) {
        int i10 = 24;
        Object obj = null;
        int i11 = this.f16274a;
        e eVar = this.f16275b;
        switch (i11) {
            case 0:
                Intrinsics.e(it, "it");
                eVar.getClass();
                eVar.f16280a = 3;
                eVar.f16287h.a();
                ArrayList arrayList = eVar.f16286g;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b();
                }
                arrayList.clear();
                return;
            case 1:
                Intrinsics.e(it, "it");
                eVar.getClass();
                eVar.f16280a = 2;
                if (eVar.f16289j.c()) {
                    eVar.f16287h.b();
                    return;
                }
                return;
            case 2:
                Intrinsics.e(it, "it");
                m mVar = eVar.f16289j;
                StringBuilder sb2 = new StringBuilder("Channel: timeouts ");
                sb2.append(eVar.f16288i);
                sb2.append(", ");
                g gVar = eVar.f16285f;
                sb2.append(gVar.f16298d);
                sb2.append(" after ");
                sb2.append(eVar.f16283d);
                sb2.append(" ms");
                mVar.d(sb2.toString());
                new g(eVar, eVar.f16283d).b();
                eVar.f16280a = 2;
                String str = gVar.f16299e;
                if (str != null) {
                    e eVar2 = gVar.f16300f;
                    eVar2.getClass();
                    ConcurrentLinkedQueue concurrentLinkedQueue = eVar2.f16281b;
                    zd.g predicate = new zd.g(str, i10, obj);
                    Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<this>");
                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                    d0.o(concurrentLinkedQueue, predicate, true);
                }
                gVar.f16298d = null;
                gVar.f16299e = null;
                gVar.f16295a = null;
                if (eVar.f16289j.c()) {
                    eVar.f16287h.b();
                    return;
                }
                return;
            case 3:
                Intrinsics.e(it, "it");
                eVar.f16287h.a();
                StringBuilder sb3 = new StringBuilder("Channel: close ");
                sb3.append(eVar.f16288i);
                sb3.append(' ');
                sb3.append(eVar.f16285f.f16298d);
                String sb4 = sb3.toString();
                m mVar2 = eVar.f16289j;
                mVar2.d(sb4);
                eVar.f16280a = 1;
                ArrayList arrayList2 = mVar2.f16326k;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!Intrinsics.a(((e) next).f16285f.f16298d, r0.f16298d)) {
                        arrayList3.add(next);
                    }
                }
                mVar2.f16326k = arrayList3;
                return;
            case 4:
                Intrinsics.e(it, "it");
                eVar.f16289j.d("Channel: error " + eVar.f16288i + ' ' + it.c());
                if (eVar.f16280a == 4) {
                    g gVar2 = eVar.f16285f;
                    String str2 = gVar2.f16299e;
                    if (str2 != null) {
                        e eVar3 = gVar2.f16300f;
                        eVar3.getClass();
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = eVar3.f16281b;
                        zd.g predicate2 = new zd.g(str2, i10, obj);
                        Intrinsics.checkNotNullParameter(concurrentLinkedQueue2, "<this>");
                        Intrinsics.checkNotNullParameter(predicate2, "predicate");
                        d0.o(concurrentLinkedQueue2, predicate2, true);
                    }
                    gVar2.f16298d = null;
                    gVar2.f16299e = null;
                    gVar2.f16295a = null;
                }
                eVar.f16280a = 2;
                if (eVar.f16289j.c()) {
                    eVar.f16287h.b();
                    return;
                }
                return;
            case 5:
                Intrinsics.e(it, "message");
                String ref = it.d();
                eVar.getClass();
                Intrinsics.e(ref, "ref");
                eVar.h("chan_reply_".concat(ref), it.c(), it.d(), it.b());
                return;
            default:
                Intrinsics.e(it, "it");
                eVar.f16289j.d("Channel: leave " + eVar.f16288i);
                Map payload = o0.b(new Pair("reason", "leave"));
                Intrinsics.e(payload, "payload");
                eVar.h("phx_close", payload, HttpUrl.FRAGMENT_ENCODE_SET, null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f16274a) {
            case 0:
                a((f) obj);
                return Unit.f23355a;
            case 1:
                a((f) obj);
                return Unit.f23355a;
            case 2:
                a((f) obj);
                return Unit.f23355a;
            case 3:
                a((f) obj);
                return Unit.f23355a;
            case 4:
                a((f) obj);
                return Unit.f23355a;
            case 5:
                a((f) obj);
                return Unit.f23355a;
            default:
                a((f) obj);
                return Unit.f23355a;
        }
    }
}
