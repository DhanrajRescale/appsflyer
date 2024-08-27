package gs;

import el.l;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ll.e;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17553b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f17552a = i10;
        this.f17553b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17552a;
        boolean z10 = false;
        Object obj = this.f17553b;
        switch (i10) {
            case 0:
                Thread.currentThread().setName("WebsocketWriteThread");
                while (!Thread.interrupted()) {
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) ((b) obj).f17555h.f16228a.take();
                        ((b) obj).f17558k.write(byteBuffer.array(), 0, byteBuffer.limit());
                        ((b) obj).f17558k.flush();
                    } catch (IOException unused) {
                        ((b) obj).f17555h.f();
                        return;
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
                return;
            case 1:
                try {
                    InetAddress byName = InetAddress.getByName("api.mixpanel.com");
                    InetAddress byName2 = InetAddress.getByName("decide.mixpanel.com");
                    if (byName.isLoopbackAddress() || byName.isAnyLocalAddress() || byName2.isLoopbackAddress() || byName2.isAnyLocalAddress()) {
                        z10 = true;
                    }
                    e.f24906b = z10;
                    if (z10) {
                        l.T0("MixpanelAPI.Message", "AdBlocker is enabled. Won't be able to use Mixpanel services.");
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            default:
                Intrinsics.b(((Function0) obj).mo2invoke(), "invoke(...)");
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar) {
        this(bVar, 0);
        this.f17552a = 0;
    }
}
