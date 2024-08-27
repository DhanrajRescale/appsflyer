package vt;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class u implements Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38343b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f38342a = i10;
        this.f38343b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f38342a;
        Object obj = this.f38343b;
        switch (i10) {
            case 0:
                return zq.f.U((Object[]) obj);
            default:
                return ((Sequence) obj).iterator();
        }
    }
}
