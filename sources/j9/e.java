package j9;

import com.airbnb.lottie.LottieAnimationView;
import d2.f1;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements a0 {
    @Override // j9.a0
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        e eVar = LottieAnimationView.f8358r;
        f1 f1Var = w9.f.f38892a;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        w9.b.c("Unable to load composition.", th2);
    }
}
