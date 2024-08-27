package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34937a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f34938b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f34939c;

    public a(Object obj) {
        this.f34937a = obj;
        this.f34939c = obj;
    }

    @Override // t0.f
    public final void b(Object obj) {
        this.f34938b.add(this.f34939c);
        this.f34939c = obj;
    }

    @Override // t0.f
    public final void clear() {
        this.f34938b.clear();
        this.f34939c = this.f34937a;
        ((androidx.compose.ui.node.a) ((c2.e2) this).f34937a).M();
    }

    @Override // t0.f
    public final void e() {
        ArrayList arrayList = this.f34938b;
        if (!arrayList.isEmpty()) {
            this.f34939c = arrayList.remove(arrayList.size() - 1);
        } else {
            al.d.f1("empty stack");
            throw null;
        }
    }

    @Override // t0.f
    public final Object h() {
        return this.f34939c;
    }
}
