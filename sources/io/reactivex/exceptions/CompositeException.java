package io.reactivex.exceptions;

import dt.a;
import dt.b;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a, reason: collision with root package name */
    public final List f20459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20460b;

    /* renamed from: c, reason: collision with root package name */
    public a f20461c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public final void b(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f20459a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.t0(sb2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, dt.a] */
    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f20461c == null) {
                ?? runtimeException = new RuntimeException();
                HashSet hashSet = new HashSet();
                Throwable th2 = runtimeException;
                for (Throwable th3 : this.f20459a) {
                    if (!hashSet.contains(th3)) {
                        hashSet.add(th3);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = th3.getCause();
                        if (cause != null && cause != th3) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Throwable th4 = (Throwable) it.next();
                            if (hashSet.contains(th4)) {
                                th3 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th4);
                            }
                        }
                        try {
                            th2.initCause(th3);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = th2.getCause();
                        if (cause3 != null && th2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            th2 = cause3;
                        }
                    }
                }
                this.f20461c = runtimeException;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return this.f20461c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f20460b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new b(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).f20459a);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f20459a = unmodifiableList;
            this.f20460b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new b(printWriter, 1));
    }
}
