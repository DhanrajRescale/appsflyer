package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import qu.i0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f827a;

    /* renamed from: b, reason: collision with root package name */
    public final long f828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f829c;

    /* renamed from: d, reason: collision with root package name */
    public final float f830d;

    /* renamed from: e, reason: collision with root package name */
    public final long f831e;

    /* renamed from: f, reason: collision with root package name */
    public final int f832f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f833g;

    /* renamed from: h, reason: collision with root package name */
    public final long f834h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f835i;

    /* renamed from: j, reason: collision with root package name */
    public final long f836j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f837k;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final String f838a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f839b;

        /* renamed from: c, reason: collision with root package name */
        public final int f840c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f841d;

        public CustomAction(Parcel parcel) {
            this.f838a = parcel.readString();
            this.f839b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f840c = parcel.readInt();
            this.f841d = parcel.readBundle(i0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f839b) + ", mIcon=" + this.f840c + ", mExtras=" + this.f841d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f838a);
            TextUtils.writeToParcel(this.f839b, parcel, i10);
            parcel.writeInt(this.f840c);
            parcel.writeBundle(this.f841d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f827a = parcel.readInt();
        this.f828b = parcel.readLong();
        this.f830d = parcel.readFloat();
        this.f834h = parcel.readLong();
        this.f829c = parcel.readLong();
        this.f831e = parcel.readLong();
        this.f833g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f835i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f836j = parcel.readLong();
        this.f837k = parcel.readBundle(i0.class.getClassLoader());
        this.f832f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f827a);
        sb2.append(", position=");
        sb2.append(this.f828b);
        sb2.append(", buffered position=");
        sb2.append(this.f829c);
        sb2.append(", speed=");
        sb2.append(this.f830d);
        sb2.append(", updated=");
        sb2.append(this.f834h);
        sb2.append(", actions=");
        sb2.append(this.f831e);
        sb2.append(", error code=");
        sb2.append(this.f832f);
        sb2.append(", error message=");
        sb2.append(this.f833g);
        sb2.append(", custom actions=");
        sb2.append(this.f835i);
        sb2.append(", active item id=");
        return a3.a.j(sb2, this.f836j, UrlTreeKt.componentParamSuffix);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f827a);
        parcel.writeLong(this.f828b);
        parcel.writeFloat(this.f830d);
        parcel.writeLong(this.f834h);
        parcel.writeLong(this.f829c);
        parcel.writeLong(this.f831e);
        TextUtils.writeToParcel(this.f833g, parcel, i10);
        parcel.writeTypedList(this.f835i);
        parcel.writeLong(this.f836j);
        parcel.writeBundle(this.f837k);
        parcel.writeInt(this.f832f);
    }
}
