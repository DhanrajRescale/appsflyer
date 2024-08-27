package um;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.BEChartData;

/* loaded from: classes2.dex */
public class i extends f implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new zi.j(26);

    /* renamed from: c, reason: collision with root package name */
    public float f37277c;

    public i(float f10, float f11, BEChartData bEChartData) {
        super(f11);
        this.f37247b = bEChartData;
        this.f37277c = f10;
    }

    public float b() {
        return this.f37277c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f37277c + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f37277c);
        parcel.writeFloat(a());
        Object obj = this.f37247b;
        if (obj != null) {
            if (obj instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) this.f37247b, i10);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    public i(float f10, float f11) {
        super(f11);
        this.f37277c = f10;
    }
}
