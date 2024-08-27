package androidx.loader.content;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class j extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        i iVar = (i) message.obj;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                iVar.f2036a.getClass();
                return;
            }
            return;
        }
        a aVar = iVar.f2036a;
        Object obj = iVar.f2037b[0];
        if (aVar.f2024d.get()) {
            countDownLatch = aVar.f2026f;
            try {
                aVar.f2028h.dispatchOnCancelled(aVar, obj);
                countDownLatch.countDown();
            } finally {
            }
        } else {
            countDownLatch = aVar.f2026f;
            try {
                aVar.f2028h.dispatchOnLoadComplete(aVar, obj);
            } finally {
            }
        }
        aVar.f2023c = 3;
    }
}
