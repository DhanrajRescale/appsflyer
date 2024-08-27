package d1;

import java.util.Map;
import t0.n0;

/* loaded from: classes.dex */
public final class j implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13273c;

    public j(i iVar, k kVar, Object obj) {
        this.f13271a = iVar;
        this.f13272b = kVar;
        this.f13273c = obj;
    }

    @Override // t0.n0
    public final void a() {
        k kVar = this.f13272b;
        Map map = kVar.f13276a;
        i iVar = this.f13271a;
        if (iVar.f13269b) {
            Map b10 = iVar.f13270c.b();
            boolean isEmpty = b10.isEmpty();
            Object obj = iVar.f13268a;
            if (isEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, b10);
            }
        }
        kVar.f13277b.remove(this.f13273c);
    }
}
