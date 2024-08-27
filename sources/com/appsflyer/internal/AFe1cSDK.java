package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFe1cSDK {
    public final List<AFe1fSDK> AFInAppEventParameterName;
    final Timer AFInAppEventType;
    final Set<AFf1zSDK> AFKeystoreWrapper;
    final List<AFe1dSDK<?>> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    final Set<AFf1zSDK> f8424d;

    /* renamed from: e, reason: collision with root package name */
    final NavigableSet<AFe1dSDK<?>> f8425e;
    final Set<AFe1dSDK<?>> registerClient;
    final NavigableSet<AFe1dSDK<?>> unregisterClient;
    public Executor valueOf;
    final ExecutorService values;

    /* renamed from: com.appsflyer.internal.AFe1cSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1cSDK.this.f8425e) {
                try {
                    final AFe1dSDK<?> pollFirst = AFe1cSDK.this.f8425e.pollFirst();
                    if (pollFirst == null) {
                        return;
                    }
                    AFe1cSDK.this.registerClient.add(pollFirst);
                    long AFInAppEventParameterName = pollFirst.AFInAppEventParameterName();
                    AFf1xSDK aFf1xSDK = new AFf1xSDK(Thread.currentThread());
                    if (AFInAppEventParameterName > 0) {
                        AFe1cSDK.this.AFInAppEventType.schedule(aFf1xSDK, AFInAppEventParameterName);
                    }
                    final AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                    aFe1cSDK.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                            while (it.hasNext()) {
                                it.next().values(pollFirst);
                            }
                        }
                    });
                    if (!AFe1cSDK.this.f8425e.isEmpty()) {
                        AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                        aFe1cSDK2.values.submit(new AnonymousClass1());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                        final AFe1bSDK call = pollFirst.call();
                        aFf1xSDK.cancel();
                        final AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                        aFe1cSDK3.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1aSDK aFg1aSDK = AFg1aSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(call);
                                aFLogger.d(aFg1aSDK, sb2.toString());
                                AFe1cSDK.this.registerClient.remove(pollFirst);
                                Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it.hasNext()) {
                                    it.next().values(pollFirst, call);
                                }
                                if (call == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (pollFirst.valueOf()) {
                                    if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                        synchronized (AFe1cSDK.this.f8425e) {
                                            try {
                                                AFe1cSDK.this.AFLogger.add(pollFirst);
                                                for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                        final AFe1bSDK aFe1bSDK = AFe1bSDK.TIMEOUT;
                        pollFirst.values = aFe1bSDK;
                        final AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                        aFe1cSDK4.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1aSDK aFg1aSDK = AFg1aSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1bSDK);
                                aFLogger.d(aFg1aSDK, sb2.toString());
                                AFe1cSDK.this.registerClient.remove(pollFirst);
                                Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it.hasNext()) {
                                    it.next().values(pollFirst, aFe1bSDK);
                                }
                                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (pollFirst.valueOf()) {
                                    if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                        synchronized (AFe1cSDK.this.f8425e) {
                                            try {
                                                AFe1cSDK.this.AFLogger.add(pollFirst);
                                                for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1xSDK.cancel();
                        final AFe1cSDK aFe1cSDK5 = AFe1cSDK.this;
                        final AFe1bSDK aFe1bSDK2 = AFe1bSDK.FAILURE;
                        aFe1cSDK5.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1aSDK aFg1aSDK = AFg1aSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(pollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1bSDK2);
                                aFLogger.d(aFg1aSDK, sb2.toString());
                                AFe1cSDK.this.registerClient.remove(pollFirst);
                                Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                                while (it.hasNext()) {
                                    it.next().values(pollFirst, aFe1bSDK2);
                                }
                                if (aFe1bSDK2 == AFe1bSDK.SUCCESS) {
                                    AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                    AFe1cSDK.valueOf(AFe1cSDK.this);
                                    return;
                                }
                                if (pollFirst.valueOf()) {
                                    if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                        synchronized (AFe1cSDK.this.f8425e) {
                                            try {
                                                AFe1cSDK.this.AFLogger.add(pollFirst);
                                                for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1cSDK$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFe1dSDK values;

        public AnonymousClass2(AFe1dSDK aFe1dSDK) {
            this.values = aFe1dSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1cSDK.this.f8425e) {
                try {
                    if (AFe1cSDK.this.registerClient.contains(this.values)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK = AFg1aSDK.QUEUE;
                        StringBuilder sb2 = new StringBuilder("tried to add already running task: ");
                        sb2.append(this.values);
                        aFLogger.d(aFg1aSDK, sb2.toString());
                        return;
                    }
                    if (!AFe1cSDK.this.f8425e.contains(this.values) && !AFe1cSDK.this.unregisterClient.contains(this.values)) {
                        AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                        AFe1dSDK aFe1dSDK = this.values;
                        for (AFf1zSDK aFf1zSDK : aFe1dSDK.AFInAppEventParameterName) {
                            if (aFe1cSDK.f8424d.contains(aFf1zSDK)) {
                                aFe1dSDK.valueOf.add(aFf1zSDK);
                            }
                        }
                        if (AFe1cSDK.this.valueOf((AFe1dSDK<?>) this.values)) {
                            add = AFe1cSDK.this.f8425e.add(this.values);
                        } else {
                            add = AFe1cSDK.this.unregisterClient.add(this.values);
                            if (add) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1aSDK aFg1aSDK2 = AFg1aSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("new task was blocked: ");
                                sb3.append(this.values);
                                aFLogger2.d(aFg1aSDK2, sb3.toString());
                                this.values.values();
                            }
                        }
                        if (add) {
                            AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                            aFe1cSDK2.f8425e.addAll(aFe1cSDK2.AFLogger);
                            AFe1cSDK.this.AFLogger.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1aSDK aFg1aSDK3 = AFg1aSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("task not added, it's already in the queue: ");
                            sb4.append(this.values);
                            aFLogger3.d(aFg1aSDK3, sb4.toString());
                        }
                        if (add) {
                            AFe1cSDK.this.f8424d.add(this.values.AFInAppEventType);
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1aSDK aFg1aSDK4 = AFg1aSDK.QUEUE;
                            StringBuilder sb5 = new StringBuilder("new task added: ");
                            sb5.append(this.values);
                            aFLogger4.d(aFg1aSDK4, sb5.toString());
                            for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                            }
                            AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                            aFe1cSDK3.values.submit(new AnonymousClass1());
                            AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                            synchronized (aFe1cSDK4.f8425e) {
                                try {
                                    for (int size = (aFe1cSDK4.f8425e.size() + aFe1cSDK4.unregisterClient.size()) - 40; size > 0; size--) {
                                        boolean z10 = !aFe1cSDK4.unregisterClient.isEmpty();
                                        boolean z11 = !aFe1cSDK4.f8425e.isEmpty();
                                        if (z11 && z10) {
                                            if (aFe1cSDK4.f8425e.first().compareTo(aFe1cSDK4.unregisterClient.first()) > 0) {
                                                aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.f8425e);
                                            } else {
                                                aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.unregisterClient);
                                            }
                                        } else if (z11) {
                                            aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.f8425e);
                                        } else if (z10) {
                                            aFe1cSDK4.AFInAppEventParameterName(aFe1cSDK4.unregisterClient);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return;
                        }
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1aSDK aFg1aSDK5 = AFg1aSDK.QUEUE;
                        StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already pending task: ");
                        sb6.append(this.values);
                        aFLogger5.w(aFg1aSDK5, sb6.toString());
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK6 = AFg1aSDK.QUEUE;
                    StringBuilder sb7 = new StringBuilder("tried to add already scheduled task: ");
                    sb7.append(this.values);
                    aFLogger6.d(aFg1aSDK6, sb7.toString());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public AFe1cSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.valueOf = newSingleThreadExecutor;
        this.AFInAppEventType = new Timer(true);
        this.AFInAppEventParameterName = new CopyOnWriteArrayList();
        this.AFKeystoreWrapper = new CopyOnWriteArraySet();
        this.f8424d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f8425e = new ConcurrentSkipListSet();
        this.unregisterClient = new ConcurrentSkipListSet();
        this.AFLogger = new ArrayList();
        this.registerClient = Collections.newSetFromMap(new ConcurrentHashMap());
        this.values = executorService;
    }

    public static boolean AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        if ((aFe1dSDK instanceof AFf1iSDK) && aFe1dSDK.AFInAppEventType == AFf1zSDK.ARS_VALIDATE) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(AFe1dSDK<?> aFe1dSDK) {
        return this.AFKeystoreWrapper.containsAll(aFe1dSDK.valueOf);
    }

    public final void AFInAppEventParameterName(NavigableSet<AFe1dSDK<?>> navigableSet) {
        AFe1dSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
        Iterator<AFe1fSDK> it = this.AFInAppEventParameterName.iterator();
        while (it.hasNext()) {
            it.next().AFInAppEventType(pollFirst);
        }
    }

    public static /* synthetic */ void valueOf(AFe1cSDK aFe1cSDK) {
        synchronized (aFe1cSDK.f8425e) {
            try {
                Iterator<AFe1dSDK<?>> it = aFe1cSDK.unregisterClient.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    AFe1dSDK<?> next = it.next();
                    if (aFe1cSDK.valueOf(next)) {
                        it.remove();
                        aFe1cSDK.f8425e.add(next);
                        z10 = true;
                    }
                }
                if (z10) {
                    aFe1cSDK.values.submit(new AnonymousClass1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
