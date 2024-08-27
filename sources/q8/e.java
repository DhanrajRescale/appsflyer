package q8;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final d f31839a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f31841c;

    public e(h hVar, d dVar) {
        this.f31841c = hVar;
        this.f31839a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f31840b) {
            this.f31840b = true;
            h hVar = this.f31841c;
            synchronized (hVar) {
                d dVar = this.f31839a;
                int i10 = dVar.f31837h - 1;
                dVar.f31837h = i10;
                if (i10 == 0 && dVar.f31835f) {
                    Regex regex = h.f31844q;
                    hVar.x(dVar);
                }
                Unit unit = Unit.f23355a;
            }
        }
    }
}
