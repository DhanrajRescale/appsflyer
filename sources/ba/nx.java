package ba;

import android.widget.TextView;
import com.assetgro.stockgro.data.model.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nx extends t9 {

    /* renamed from: v, reason: collision with root package name */
    public long f5620v;

    @Override // m4.m
    public final void b() {
        long j10;
        Unit unit;
        String message;
        synchronized (this) {
            j10 = this.f5620v;
            this.f5620v = 0L;
        }
        ChatMessage chatMessage = (ChatMessage) this.f6172u;
        if ((j10 & 3) != 0) {
            TextView textView = (TextView) this.f6170s;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            if (chatMessage != null && (message = chatMessage.getMessage()) != null) {
                textView.setVisibility(0);
                textView.setText(message);
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit == null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5620v != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.f5620v = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
