package androidx.loader.app;

import android.os.Looper;
import androidx.lifecycle.h1;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import t.k0;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: a, reason: collision with root package name */
    public final t f2017a;

    /* renamed from: b, reason: collision with root package name */
    public final LoaderManagerImpl$LoaderViewModel f2018b;

    public f(t tVar, h1 store) {
        this.f2017a = tVar;
        Intrinsics.checkNotNullParameter(store, "store");
        e factory = LoaderManagerImpl$LoaderViewModel.f2005d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        y4.a defaultCreationExtras = y4.a.f41149b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(LoaderManagerImpl$LoaderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LoaderManagerImpl$LoaderViewModel.class, "<this>", LoaderManagerImpl$LoaderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            this.f2018b = (LoaderManagerImpl$LoaderViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // androidx.loader.app.b
    public final androidx.loader.content.e b(a aVar) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.f2018b;
        if (!loaderManagerImpl$LoaderViewModel.f2007c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                c cVar = (c) loaderManagerImpl$LoaderViewModel.f2006b.e(0);
                t tVar = this.f2017a;
                if (cVar == null) {
                    try {
                        loaderManagerImpl$LoaderViewModel.f2007c = true;
                        androidx.loader.content.e onCreateLoader = aVar.onCreateLoader(0, null);
                        if (onCreateLoader != null) {
                            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                            }
                            c cVar2 = new c(onCreateLoader);
                            loaderManagerImpl$LoaderViewModel.f2006b.g(0, cVar2);
                            loaderManagerImpl$LoaderViewModel.f2007c = false;
                            androidx.loader.content.e eVar = cVar2.f2010c;
                            d dVar = new d(eVar, aVar);
                            cVar2.observe(tVar, dVar);
                            d dVar2 = cVar2.f2012e;
                            if (dVar2 != null) {
                                cVar2.removeObserver(dVar2);
                            }
                            cVar2.f2011d = tVar;
                            cVar2.f2012e = dVar;
                            return eVar;
                        }
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } catch (Throwable th2) {
                        loaderManagerImpl$LoaderViewModel.f2007c = false;
                        throw th2;
                    }
                }
                androidx.loader.content.e eVar2 = cVar.f2010c;
                d dVar3 = new d(eVar2, aVar);
                cVar.observe(tVar, dVar3);
                d dVar4 = cVar.f2012e;
                if (dVar4 != null) {
                    cVar.removeObserver(dVar4);
                }
                cVar.f2011d = tVar;
                cVar.f2012e = dVar3;
                return eVar2;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        k0 k0Var = this.f2018b.f2006b;
        if (k0Var.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < k0Var.h(); i10++) {
                c cVar = (c) k0Var.i(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(k0Var.f(i10));
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(cVar.f2008a);
                printWriter.print(" mArgs=");
                printWriter.println(cVar.f2009b);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                androidx.loader.content.e eVar = cVar.f2010c;
                printWriter.println(eVar);
                eVar.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (cVar.f2012e != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cVar.f2012e);
                    d dVar = cVar.f2012e;
                    dVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dVar.f2016c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(eVar.dataToString(cVar.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(cVar.hasActiveObservers());
            }
        }
    }

    public final void d() {
        k0 k0Var = this.f2018b.f2006b;
        int h10 = k0Var.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((c) k0Var.i(i10)).a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        hl.f.x(this.f2017a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
