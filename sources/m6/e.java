package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new k6.d(13);

    /* renamed from: a, reason: collision with root package name */
    public final long f27600a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27601b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27602c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27603d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27604e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27605f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27606g;

    /* renamed from: h, reason: collision with root package name */
    public final List f27607h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27608i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27609j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27610k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27611l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27612m;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f27600a = j10;
        this.f27601b = z10;
        this.f27602c = z11;
        this.f27603d = z12;
        this.f27604e = z13;
        this.f27605f = j11;
        this.f27606g = j12;
        this.f27607h = Collections.unmodifiableList(list);
        this.f27608i = z14;
        this.f27609j = j13;
        this.f27610k = i10;
        this.f27611l = i11;
        this.f27612m = i12;
    }

    @Override // m6.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f27605f);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a3.a.j(sb2, this.f27606g, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27600a);
        parcel.writeByte(this.f27601b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27602c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27603d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27604e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27605f);
        parcel.writeLong(this.f27606g);
        List list = this.f27607h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f27597a);
            parcel.writeLong(dVar.f27598b);
            parcel.writeLong(dVar.f27599c);
        }
        parcel.writeByte(this.f27608i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27609j);
        parcel.writeInt(this.f27610k);
        parcel.writeInt(this.f27611l);
        parcel.writeInt(this.f27612m);
    }

    public e(Parcel parcel) {
        this.f27600a = parcel.readLong();
        this.f27601b = parcel.readByte() == 1;
        this.f27602c = parcel.readByte() == 1;
        this.f27603d = parcel.readByte() == 1;
        this.f27604e = parcel.readByte() == 1;
        this.f27605f = parcel.readLong();
        this.f27606g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f27607h = Collections.unmodifiableList(arrayList);
        this.f27608i = parcel.readByte() == 1;
        this.f27609j = parcel.readLong();
        this.f27610k = parcel.readInt();
        this.f27611l = parcel.readInt();
        this.f27612m = parcel.readInt();
    }
}
