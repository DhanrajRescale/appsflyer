package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.actions.exception.ImageLoadException;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.l.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class x implements com.webengage.sdk.android.utils.l.c {
    @Override // com.webengage.sdk.android.utils.l.c
    public com.webengage.sdk.android.utils.l.g a(com.webengage.sdk.android.utils.l.g gVar, Context context) {
        g.b a10;
        if (gVar.k() != null) {
            try {
                if ("landscape".equalsIgnoreCase(gVar.k())) {
                    return gVar.d().b(new ByteArrayInputStream(WebEngageUtils.a(com.webengage.sdk.android.utils.g.a(gVar, 192.0f, context.getApplicationContext())))).a();
                }
                if ("portrait".equalsIgnoreCase(gVar.k())) {
                    return gVar.d().b(new ByteArrayInputStream(WebEngageUtils.a(com.webengage.sdk.android.utils.g.a(gVar, 192.0f, 192.0f, context.getApplicationContext())))).a();
                }
            } catch (Exception e10) {
                a10 = gVar.d().a(new ImageLoadException(e10.getMessage()));
                return a10.b((InputStream) null).a();
            } catch (OutOfMemoryError unused) {
                a10 = gVar.d().a(new ImageLoadException("OutOfMemoryError"));
                return a10.b((InputStream) null).a();
            }
        }
        return gVar;
    }

    @Override // com.webengage.sdk.android.utils.l.c
    public boolean a(com.webengage.sdk.android.utils.l.f fVar, Context context) {
        return true;
    }
}
