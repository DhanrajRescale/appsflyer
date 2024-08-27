package q6;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h5.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f31661c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31662d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31663e;

    public a(int i10, long j10) {
        super(i10);
        this.f31661c = j10;
        this.f31662d = new ArrayList();
        this.f31663e = new ArrayList();
    }

    public final a i(int i10) {
        ArrayList arrayList = this.f31663e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f17988b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b j(int i10) {
        ArrayList arrayList = this.f31662d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f17988b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // h5.a
    public final String toString() {
        return h5.a.f(this.f17988b) + " leaves: " + Arrays.toString(this.f31662d.toArray()) + " containers: " + Arrays.toString(this.f31663e.toArray());
    }
}
