package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f842a;

    public /* synthetic */ a(int i10) {
        this.f842a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f842a) {
            case 0:
                ?? obj = new Object();
                obj.f819a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f817a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f818b;

                    {
                        this.f817a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f818b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f817a);
                        sb2.append(", Id=");
                        return a3.a.j(sb2, this.f818b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f817a.writeToParcel(parcel2, i10);
                        parcel2.writeLong(this.f818b);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: a, reason: collision with root package name */
                    public final Object f820a;

                    /* renamed from: b, reason: collision with root package name */
                    public final Object f821b;

                    {
                        this.f821b = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj2;
                        Object obj3 = this.f821b;
                        if (obj3 == null) {
                            if (mediaSessionCompat$Token.f821b == null) {
                                return true;
                            }
                            return false;
                        }
                        Object obj4 = mediaSessionCompat$Token.f821b;
                        if (obj4 == null) {
                            return false;
                        }
                        return obj3.equals(obj4);
                    }

                    public final int hashCode() {
                        Object obj2 = this.f821b;
                        if (obj2 == null) {
                            return 0;
                        }
                        return obj2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeParcelable((Parcelable) this.f821b, i10);
                    }
                };
            case 3:
                ?? obj2 = new Object();
                obj2.f822a = parcel.readInt();
                obj2.f824c = parcel.readInt();
                obj2.f825d = parcel.readInt();
                obj2.f826e = parcel.readInt();
                obj2.f823b = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f842a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 1:
                return new MediaSessionCompat$QueueItem[i10];
            case 2:
                return new MediaSessionCompat$Token[i10];
            case 3:
                return new ParcelableVolumeInfo[i10];
            default:
                return new PlaybackStateCompat[i10];
        }
    }
}
