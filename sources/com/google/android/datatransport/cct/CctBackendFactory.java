package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import hn.d;
import kn.b;
import kn.c;
import kn.g;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory {
    public g create(c cVar) {
        Context context = ((b) cVar).f23267a;
        b bVar = (b) cVar;
        return new d(context, bVar.f23268b, bVar.f23269c);
    }
}
