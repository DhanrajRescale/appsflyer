package fk;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import h.b0;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10) {
        super(context, ParcelFileDescriptor.class);
        if (i10 != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}
