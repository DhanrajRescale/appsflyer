package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1606b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1607c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1608d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1609e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1610f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1612h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1613i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1614j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1615k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1616l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1617m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1618n;

    public c(a aVar) {
        int size = aVar.f1798a.size();
        this.f1605a = new int[size * 6];
        if (aVar.f1804g) {
            this.f1606b = new ArrayList(size);
            this.f1607c = new int[size];
            this.f1608d = new int[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                o1 o1Var = (o1) aVar.f1798a.get(i11);
                int i12 = i10 + 1;
                this.f1605a[i10] = o1Var.f1787a;
                ArrayList arrayList = this.f1606b;
                g0 g0Var = o1Var.f1788b;
                arrayList.add(g0Var != null ? g0Var.mWho : null);
                int[] iArr = this.f1605a;
                iArr[i12] = o1Var.f1789c ? 1 : 0;
                iArr[i10 + 2] = o1Var.f1790d;
                iArr[i10 + 3] = o1Var.f1791e;
                int i13 = i10 + 5;
                iArr[i10 + 4] = o1Var.f1792f;
                i10 += 6;
                iArr[i13] = o1Var.f1793g;
                this.f1607c[i11] = o1Var.f1794h.ordinal();
                this.f1608d[i11] = o1Var.f1795i.ordinal();
            }
            this.f1609e = aVar.f1803f;
            this.f1610f = aVar.f1806i;
            this.f1611g = aVar.f1586s;
            this.f1612h = aVar.f1807j;
            this.f1613i = aVar.f1808k;
            this.f1614j = aVar.f1809l;
            this.f1615k = aVar.f1810m;
            this.f1616l = aVar.f1811n;
            this.f1617m = aVar.f1812o;
            this.f1618n = aVar.f1813p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.o1, java.lang.Object] */
    public final void a(a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1605a;
            boolean z10 = true;
            if (i10 < iArr.length) {
                ?? obj = new Object();
                int i12 = i10 + 1;
                obj.f1787a = iArr[i10];
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                }
                obj.f1794h = androidx.lifecycle.n.values()[this.f1607c[i11]];
                obj.f1795i = androidx.lifecycle.n.values()[this.f1608d[i11]];
                int i13 = i10 + 2;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                obj.f1789c = z10;
                int i14 = iArr[i13];
                obj.f1790d = i14;
                int i15 = iArr[i10 + 3];
                obj.f1791e = i15;
                int i16 = i10 + 5;
                int i17 = iArr[i10 + 4];
                obj.f1792f = i17;
                i10 += 6;
                int i18 = iArr[i16];
                obj.f1793g = i18;
                aVar.f1799b = i14;
                aVar.f1800c = i15;
                aVar.f1801d = i17;
                aVar.f1802e = i18;
                aVar.b(obj);
                i11++;
            } else {
                aVar.f1803f = this.f1609e;
                aVar.f1806i = this.f1610f;
                aVar.f1804g = true;
                aVar.f1807j = this.f1612h;
                aVar.f1808k = this.f1613i;
                aVar.f1809l = this.f1614j;
                aVar.f1810m = this.f1615k;
                aVar.f1811n = this.f1616l;
                aVar.f1812o = this.f1617m;
                aVar.f1813p = this.f1618n;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1605a);
        parcel.writeStringList(this.f1606b);
        parcel.writeIntArray(this.f1607c);
        parcel.writeIntArray(this.f1608d);
        parcel.writeInt(this.f1609e);
        parcel.writeString(this.f1610f);
        parcel.writeInt(this.f1611g);
        parcel.writeInt(this.f1612h);
        TextUtils.writeToParcel(this.f1613i, parcel, 0);
        parcel.writeInt(this.f1614j);
        TextUtils.writeToParcel(this.f1615k, parcel, 0);
        parcel.writeStringList(this.f1616l);
        parcel.writeStringList(this.f1617m);
        parcel.writeInt(this.f1618n ? 1 : 0);
    }

    public c(Parcel parcel) {
        this.f1605a = parcel.createIntArray();
        this.f1606b = parcel.createStringArrayList();
        this.f1607c = parcel.createIntArray();
        this.f1608d = parcel.createIntArray();
        this.f1609e = parcel.readInt();
        this.f1610f = parcel.readString();
        this.f1611g = parcel.readInt();
        this.f1612h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1613i = (CharSequence) creator.createFromParcel(parcel);
        this.f1614j = parcel.readInt();
        this.f1615k = (CharSequence) creator.createFromParcel(parcel);
        this.f1616l = parcel.createStringArrayList();
        this.f1617m = parcel.createStringArrayList();
        this.f1618n = parcel.readInt() != 0;
    }
}
