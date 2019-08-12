package com.sunilos.p09generics;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class LRUCache<E> {

	private Map<Object, E> fCacheMap;
	private int fCacheSize;

	LRUCache(int size) {
		fCacheSize = size;

		// If the cache is to be used by multiple threads,
		// the hashMap must be wrapped with code to synchronize
		fCacheMap = Collections.synchronizedMap(
		// true = use access order instead of insertion order
				new LinkedHashMap<Object, E>(fCacheSize, .75F, true) {
					@Override
					public boolean removeEldestEntry(Map.Entry eldest) {
						// when to remove the eldest entry
						return size() > 99; // size exceeded the max allowed
					}
				});
	}

	public void put(Object key, E elem) {
		fCacheMap.put(key, elem);
	}

	public E get(Object key) {
		return fCacheMap.get(key);
	}
	
	public static void main(String[] args) {
		
	}

}
