package com.wchy.structure.tree.binary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.tree.bean.Schedule;
import com.wchy.structure.tree.intf.Tree;

public class DeleteTreeTest 
{
	
	/**
	 * ����������.
	 */
	private Tree<Schedule> treeApp;

	@Before
	public void setUp() throws Exception 
	{
		treeApp = new BinaryTree<Schedule>();
		treeApp.insert(new Schedule("test-root", "home-root", "222", "201709010000"));
		treeApp.insert(new Schedule("test-1", "home-1", "211", "201709010000"));
		treeApp.insert(new Schedule("test-2", "home-2", "218", "201709010000"));
		treeApp.insert(new Schedule("test-3", "home-3", "111", "201709010000"));
		treeApp.insert(new Schedule("test-4", "home-4", "212", "201709010000"));
		treeApp.insert(new Schedule("test-5", "home-5", "219", "201709010000"));
		treeApp.insert(new Schedule("test-6", "home-6", "224", "201709010000"));
		treeApp.insert(new Schedule("test-7", "home-7", "234", "201709010000"));
		treeApp.insert(new Schedule("test-8", "home-8", "231", "201709010000"));
		treeApp.insert(new Schedule("test-9", "home-9", "314", "201709010000"));
		treeApp.insert(new Schedule("test-10", "home-10", "333", "201709010000"));
		treeApp.insert(new Schedule("test-11", "home-11", "456", "201709010000"));
		treeApp.insert(new Schedule("test-12", "home-12", "112", "201709010000"));
		treeApp.insert(new Schedule("test-13", "home-13", "110", "201709010000"));
	}

	@After
	public void tearDown() throws Exception 
	{
		treeApp = null;
	}

	@Test
	public void testDelete() 
	{
		treeApp.order("inOrder");
		treeApp.delete(new Schedule("test-13", "home-13", "218", "201709010000"));
		treeApp.order("inOrder");
	}

}
