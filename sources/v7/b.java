package v7;

import android.os.Parcel;
import android.util.SparseIntArray;
import nn.d;
import okhttp3.HttpUrl;
import t.f;
import t.j0;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f37792d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f37793e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37795g;

    /* renamed from: h, reason: collision with root package name */
    public final String f37796h;

    /* renamed from: i, reason: collision with root package name */
    public int f37797i;

    /* renamed from: j, reason: collision with root package name */
    public int f37798j;

    /* renamed from: k, reason: collision with root package name */
    public int f37799k;

    /* JADX WARN: Type inference failed for: r5v0, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [t.j0, t.f] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new j0(), new j0(), new j0());
    }

    @Override // v7.a
    public final b a() {
        Parcel parcel = this.f37793e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f37798j;
        if (i10 == this.f37794f) {
            i10 = this.f37795g;
        }
        return new b(parcel, dataPosition, i10, d.o(new StringBuilder(), this.f37796h, "  "), this.f37789a, this.f37790b, this.f37791c);
    }

    @Override // v7.a
    public final boolean e(int i10) {
        while (this.f37798j < this.f37795g) {
            int i11 = this.f37799k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f37798j;
            Parcel parcel = this.f37793e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f37799k = parcel.readInt();
            this.f37798j += readInt;
        }
        if (this.f37799k != i10) {
            return false;
        }
        return true;
    }

    @Override // v7.a
    public final void i(int i10) {
        int i11 = this.f37797i;
        SparseIntArray sparseIntArray = this.f37792d;
        Parcel parcel = this.f37793e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f37797i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f37792d = new SparseIntArray();
        this.f37797i = -1;
        this.f37799k = -1;
        this.f37793e = parcel;
        this.f37794f = i10;
        this.f37795g = i11;
        this.f37798j = i10;
        this.f37796h = str;
    }
}
