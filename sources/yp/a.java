package yp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import da.e;

/* loaded from: classes2.dex */
public final class a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.datepicker.a(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f41787a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41789c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41790d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f41791e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41792f;

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.f41787a = i10;
        this.f41788b = z10;
        this.f41789c = str;
        this.f41790d = str2;
        this.f41791e = bArr;
        this.f41792f = z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.f41787a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.f41788b);
        sb2.append("' } ");
        String str = this.f41789c;
        if (str != null) {
            sb2.append("{ completionToken: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        String str2 = this.f41790d;
        if (str2 != null) {
            sb2.append("{ accountName: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        byte[] bArr = this.f41791e;
        if (bArr != null) {
            sb2.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(b10));
                sb2.append(" ");
            }
            sb2.append("] } ");
        }
        sb2.append("{ contextOnly: '");
        return e.o(sb2, this.f41792f, "' } }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f41787a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f41788b);
        SafeParcelWriter.writeString(parcel, 3, this.f41789c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f41790d, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f41791e, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f41792f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
