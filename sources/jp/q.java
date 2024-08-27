package jp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.flipkart.youtubeview.activity.YouTubeActivity;

/* loaded from: classes2.dex */
public final class q extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek.u f21561a;

    public q(ek.u uVar) {
        this.f21561a = uVar;
        attachInterface(this, "com.google.android.youtube.player.internal.IOnFullscreenListener");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
            return true;
        }
        parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
        parcel.readInt();
        YouTubeActivity youTubeActivity = (YouTubeActivity) this.f21561a.f15627b;
        int i12 = YouTubeActivity.f10966g;
        youTubeActivity.b();
        parcel2.writeNoException();
        return true;
    }
}
