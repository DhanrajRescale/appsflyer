package i7;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f19694a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19695b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19696c;

    /* renamed from: d, reason: collision with root package name */
    public final File f19697d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19699f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f19700g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f19701h;

    public a(AssetManager assetManager, n.a aVar, t9.c cVar, String str, File file) {
        this.f19694a = aVar;
        this.f19695b = cVar;
        this.f19698e = str;
        this.f19697d = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = d.f19718h;
                    break;
                case 26:
                    bArr = d.f19717g;
                    break;
                case 27:
                    bArr = d.f19716f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f19715e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f19714d;
                    break;
            }
        }
        this.f19696c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f19695b.g();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f19694a.execute(new defpackage.a(this, i10, serializable, 4));
    }
}
