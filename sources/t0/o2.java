package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 implements Iterable, ju.a {

    /* renamed from: b, reason: collision with root package name */
    public int f35107b;

    /* renamed from: d, reason: collision with root package name */
    public int f35109d;

    /* renamed from: e, reason: collision with root package name */
    public int f35110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35111f;

    /* renamed from: g, reason: collision with root package name */
    public int f35112g;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f35114i;

    /* renamed from: j, reason: collision with root package name */
    public t.t f35115j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f35106a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f35108c = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f35113h = new ArrayList();

    public final int b(d dVar) {
        if (!this.f35111f) {
            if (dVar.a()) {
                return dVar.f34969a;
            }
            al.d.e1("Anchor refers to a group that was removed");
            throw null;
        }
        t.F("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final void e() {
        this.f35114i = new HashMap();
    }

    public final n2 g() {
        if (!this.f35111f) {
            this.f35110e++;
            return new n2(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final q2 h() {
        boolean z10;
        if (!this.f35111f) {
            if (this.f35110e <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f35111f = true;
                this.f35112g++;
                return new q2(this);
            }
            t.F("Cannot start a writer when a reader is pending");
            throw null;
        }
        t.F("Cannot start a writer when another writer is pending");
        throw null;
    }

    public final boolean i(d dVar) {
        int H1;
        if (dVar.a() && (H1 = dp.b.H1(this.f35113h, dVar.f34969a, this.f35107b)) >= 0 && Intrinsics.a(this.f35113h.get(H1), dVar)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r0(0, this.f35107b, this);
    }
}
