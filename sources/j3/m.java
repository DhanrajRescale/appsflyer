package j3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends d {

    /* renamed from: s0, reason: collision with root package name */
    public ArrayList f20935s0;

    @Override // j3.d
    public void E() {
        this.f20935s0.clear();
        super.E();
    }

    @Override // j3.d
    public final void H(h8.h hVar) {
        super.H(hVar);
        int size = this.f20935s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f20935s0.get(i10)).H(hVar);
        }
    }

    public final void W(d dVar) {
        this.f20935s0.add(dVar);
        d dVar2 = dVar.V;
        if (dVar2 != null) {
            ((m) dVar2).f20935s0.remove(dVar);
            dVar.E();
        }
        dVar.V = this;
    }

    public abstract void X();
}
