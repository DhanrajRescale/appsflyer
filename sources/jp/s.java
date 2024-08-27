package jp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.flipkart.youtubeview.activity.YouTubeActivity;

/* loaded from: classes2.dex */
public final class s extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll.o f21563a;

    public s(ll.o oVar) {
        this.f21563a = oVar;
        attachInterface(this, "com.google.android.youtube.player.internal.IPlaybackEventListener");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        ll.o oVar = this.f21563a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 1598968902) {
                                return super.onTransact(i10, parcel, parcel2, i11);
                            }
                            parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
                            return true;
                        }
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        parcel.readInt();
                        YouTubeActivity.a((YouTubeActivity) oVar.f24937b);
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    parcel.readInt();
                    oVar.getClass();
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                YouTubeActivity youTubeActivity = (YouTubeActivity) oVar.f24937b;
                int i12 = YouTubeActivity.f10966g;
                youTubeActivity.b();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
            YouTubeActivity.a((YouTubeActivity) oVar.f24937b);
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
        YouTubeActivity youTubeActivity2 = (YouTubeActivity) oVar.f24937b;
        if (youTubeActivity2.f10968f != null && !"PLAYING".equals(youTubeActivity2.f10967e)) {
            ((YouTubeActivity) oVar.f24937b).f10967e = "PLAYING";
        }
        parcel2.writeNoException();
        return true;
    }
}
