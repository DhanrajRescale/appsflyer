package ip;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.player.YouTubePlayerView;
import java.util.HashSet;
import jp.t;

/* loaded from: classes2.dex */
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f20479a;

    public h(YouTubePlayerView youTubePlayerView) {
        this.f20479a = youTubePlayerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        YouTubePlayerView youTubePlayerView = this.f20479a;
        if (youTubePlayerView.f11619e != null) {
            HashSet hashSet = youTubePlayerView.f11616b;
            if (hashSet.contains(view2) && !hashSet.contains(view)) {
                t tVar = youTubePlayerView.f11619e;
                tVar.getClass();
                try {
                    jp.b bVar = (jp.b) tVar.f21565b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        bVar.f21533a.transact(31, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th2) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
    }
}
