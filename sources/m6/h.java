package m6;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f27615a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27617c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27618d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27619e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27620f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27621g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27622h;

    /* renamed from: i, reason: collision with root package name */
    public final int f27623i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27624j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27625k;

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f27615a = j10;
        this.f27616b = z10;
        this.f27617c = z11;
        this.f27618d = z12;
        this.f27620f = Collections.unmodifiableList(arrayList);
        this.f27619e = j11;
        this.f27621g = z13;
        this.f27622h = j12;
        this.f27623i = i10;
        this.f27624j = i11;
        this.f27625k = i12;
    }

    public h(Parcel parcel) {
        this.f27615a = parcel.readLong();
        this.f27616b = parcel.readByte() == 1;
        this.f27617c = parcel.readByte() == 1;
        this.f27618d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f27620f = Collections.unmodifiableList(arrayList);
        this.f27619e = parcel.readLong();
        this.f27621g = parcel.readByte() == 1;
        this.f27622h = parcel.readLong();
        this.f27623i = parcel.readInt();
        this.f27624j = parcel.readInt();
        this.f27625k = parcel.readInt();
    }
}
